package com.example.network_retrofit.data.network.miscellaneous;

import android.content.SharedPreferences;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by mamba on 02.10.2017.
 */

public class MessageNumberGenerator {
    static final String UUID_KEY = "MSGNUM_UUID";
    static final String SEQUENCE_KEY = "SEQUENCE_KEY";

    static final int DEFAULT_SEQUENCE_VALUE = 0;
    static final String DATE_FORMAT = "yyyyMMddHHmmss";

    private final SharedPreferences preferences;
    private final String messageNumberUUID;
    private final DateFormat formatter;
    private int sequence;

    private static MessageNumberGenerator instance;

    public static synchronized MessageNumberGenerator getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Message number generator has not been initialized!");
        }
        return instance;
    }

    public static void init(SharedPreferences preferences) {
        instance = new MessageNumberGenerator(preferences);
    }

    private MessageNumberGenerator(SharedPreferences preferences) {
        if (preferences == null) {
            throw new IllegalArgumentException("Not null preferences required!");
        }
        this.preferences = preferences;
        SharedPreferences.Editor editor = preferences.edit();
        boolean changesApplied = false;

        String tempUUID = preferences.getString(UUID_KEY, null);
        if (tempUUID == null) {
            tempUUID = UUID.randomUUID().toString();
            editor.putString(UUID_KEY, tempUUID);
            changesApplied = true;
        }
        messageNumberUUID = tempUUID;

        formatter = new SimpleDateFormat(DATE_FORMAT);

        int tempSequence = preferences.getInt(SEQUENCE_KEY, DEFAULT_SEQUENCE_VALUE);
        if (tempSequence == DEFAULT_SEQUENCE_VALUE) {
            tempSequence++;
            editor.putInt(SEQUENCE_KEY, tempSequence);
            changesApplied = true;
        }
        sequence = tempSequence;

        if (changesApplied) {
            editor.commit();
        }
    }

    int getSequence() {
        return sequence;
    }

    String getMessageNumberUUID() {
        return messageNumberUUID;
    }

    public synchronized String getMessageNumber() {
        String messageNumber = formatter.format(new Date()) + "-" + messageNumberUUID + "-" + sequence;
        sequence++;
        preferences.edit().putInt(SEQUENCE_KEY, sequence).commit();
        return messageNumber;
    }
}

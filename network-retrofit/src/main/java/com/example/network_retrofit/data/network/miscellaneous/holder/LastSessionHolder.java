package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.SharedPreferences;

/**
 * Created by mamba on 02.10.2017.
 */

public class LastSessionHolder {
    public static final String LAST_USED_SESSION_KEY = "lastUsedSession";

    private final SharedPreferences preferences;
    private String lastUsedSession;

    private static LastSessionHolder instance;

    public static synchronized LastSessionHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Language information holder has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(SharedPreferences preferences) {
        instance = new LastSessionHolder(preferences);
    }

    private LastSessionHolder(SharedPreferences preferences) {
        this.preferences = preferences;
        lastUsedSession = preferences.getString(LAST_USED_SESSION_KEY, null);
    }

    public void setLastUsedSession(String lastUsedSession) {
        synchronized (this) {
            this.lastUsedSession = lastUsedSession;
        }
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(LAST_USED_SESSION_KEY, lastUsedSession);
        editor.commit();
    }

    public synchronized String getLastUsedSession() {
        return lastUsedSession;
    }
}

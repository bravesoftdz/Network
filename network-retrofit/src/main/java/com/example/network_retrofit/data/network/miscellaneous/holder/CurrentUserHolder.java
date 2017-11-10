package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.SharedPreferences;

import com.example.network_retrofit.data.network.miscellaneous.data.UserData;

/**
 * Created by mamba on 02.10.2017.
 */

public class CurrentUserHolder {
    public static final String LAST_ACTIVATED_USER_TITLE = "lastActivatedUserTitle";
    public static final String LAST_ACTIVATED_USER_DESTINATION = "lastActivatedUserDestination";

    private final SharedPreferences preferences;

    private UserData lastActivatedUser;

    private static CurrentUserHolder instance;

    public static synchronized CurrentUserHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Current user holder has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(SharedPreferences preferences) {
        instance = new CurrentUserHolder(preferences);
    }

    private CurrentUserHolder(SharedPreferences preferences) {
        this.preferences = preferences;
        String lastActivatedUserTitle = preferences.getString(LAST_ACTIVATED_USER_TITLE, null);
        String lastActivatedUserDestination  = preferences.getString(LAST_ACTIVATED_USER_DESTINATION, null);
        lastActivatedUser = new UserData(lastActivatedUserTitle, lastActivatedUserDestination);
    }

    public synchronized UserData getLastActivatedUser() {
        return lastActivatedUser;
    }

    public synchronized void setLastActivatedUser(String lastActivatedUserTitle, String lastActivatedUserDestination) {
        lastActivatedUser = new UserData(lastActivatedUserTitle, lastActivatedUserDestination);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(LAST_ACTIVATED_USER_TITLE, lastActivatedUserTitle);
        editor.putString(LAST_ACTIVATED_USER_DESTINATION, lastActivatedUserDestination);
        editor.commit();
    }
}

package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mamba on 02.10.2017.
 */

public class DataHolder {
    private static DeviceInformationHolder deviceInformationHolder;
    private static LanguageInformationHolder languageInformationHolder;
    private static CurrentUserHolder currentUserHolder;
    private static CurrentMerchantHolder currentMerchantHolder;
    private static LastSessionHolder lastSessionHolder;

    private static DataHolder instance;

    public static synchronized DataHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Data holder has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(Context context, String language, String preferencesName) {
        LanguageInformationHolder.init(language);

        SharedPreferences preferences = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE);

        DeviceInformationHolder.init(context, preferences);
        CurrentUserHolder.init(preferences);
        CurrentMerchantHolder.init(preferences);
        LastSessionHolder.init(preferences);

        instance = new DataHolder();
    }

    private DataHolder() {
        deviceInformationHolder = DeviceInformationHolder.getInstance();
        languageInformationHolder = LanguageInformationHolder.getInstance();
        currentUserHolder = CurrentUserHolder.getInstance();
        currentMerchantHolder = CurrentMerchantHolder.getInstance();
        lastSessionHolder = LastSessionHolder.getInstance();
    }

    public DeviceInformationHolder getDeviceInformationHolder() {
        return deviceInformationHolder;
    }

    public LanguageInformationHolder getLanguageInformationHolder() {
        return languageInformationHolder;
    }

    public CurrentUserHolder getCurrentUserHolder() {
        return currentUserHolder;
    }

    public CurrentMerchantHolder getCurrentMerchantHolder() {
        return currentMerchantHolder;
    }

    public LastSessionHolder getLastSessionHolder() {
        return lastSessionHolder;
    }
}

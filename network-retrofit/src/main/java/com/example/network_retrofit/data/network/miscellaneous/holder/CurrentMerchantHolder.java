package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.SharedPreferences;

import com.example.network_retrofit.data.network.miscellaneous.data.MerchantData;

/**
 * Created by mamba on 02.10.2017.
 */

public class CurrentMerchantHolder {
    public static final String LAST_ACTIVATED_MERCHANT_TITLE = "LastActivatedMerchantTitle";

    private final SharedPreferences preferences;

    private MerchantData lastActivatedMerchant;

    private static CurrentMerchantHolder instance;

    public static synchronized CurrentMerchantHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Current merchant holder has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(SharedPreferences preferences) {
        instance = new CurrentMerchantHolder(preferences);
    }

    private CurrentMerchantHolder(SharedPreferences preferences) {
        this.preferences = preferences;
        String lastActivatedMerchantTitle = preferences.getString(LAST_ACTIVATED_MERCHANT_TITLE, null);
        lastActivatedMerchant = new MerchantData(lastActivatedMerchantTitle);
    }

    public synchronized MerchantData getLastActivatedMerchant() {
        return lastActivatedMerchant;
    }

    public synchronized void setLastActivatedMerchant(String lastActivatedMerchantTitle) {
        lastActivatedMerchant = new MerchantData(lastActivatedMerchantTitle);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(LAST_ACTIVATED_MERCHANT_TITLE, lastActivatedMerchantTitle);
        editor.commit();
    }
}

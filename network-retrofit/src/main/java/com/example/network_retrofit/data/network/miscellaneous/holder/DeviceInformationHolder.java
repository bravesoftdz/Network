package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;

import com.example.network_retrofit.R;

import java.util.UUID;

/**
 * Created by mamba on 02.10.2017.
 */

public class DeviceInformationHolder {
    private final String imei;
    private final String phoneModel;
    private final String appVersion;
    private final String osVersion;
    private final String osName;
    private final String phoneInfo;
    private final String applicationName;

    public static final String IMEI_TITLE = "CustomDeviceImeiTitle";

    private static DeviceInformationHolder instance;

    public static synchronized DeviceInformationHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("DeviceInfo has not been initialized!");
        }
        return instance;
    }

    public static synchronized void init(Context context, SharedPreferences preferences) {
        instance = new DeviceInformationHolder(context, preferences);
    }

    private DeviceInformationHolder(Context context, SharedPreferences preferences) {
        String tempAppVersion;
        imei = initIMEI(context, preferences);
        try {
            tempAppVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            tempAppVersion = "Unknown";
        }
        appVersion = tempAppVersion;
        osVersion = "Android " + Build.VERSION.RELEASE;
        phoneModel = initPhoneModel();
        applicationName = context.getString(R.string.app_name);
        phoneInfo = Build.MANUFACTURER + " " + Build.VERSION.RELEASE + " " + System.getProperty("os.version") + " " + Build.MODEL;
        osName = "ANDROID";
    }

    private String initIMEI(Context context, SharedPreferences preferences) {
        String imei = preferences.getString(IMEI_TITLE, null);

        if(imei == null) {
            imei = UUID.randomUUID().toString();
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(IMEI_TITLE, imei);
            editor.commit();
        }

        return imei;
    }

    private String initPhoneModel() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        if (model.startsWith(manufacturer)) {
            return capitalize(model);
        } else {
            return capitalize(manufacturer) + " " + model;
        }
    }

    private static String capitalize(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char first = s.charAt(0);
        if (Character.isUpperCase(first)) {
            return s;
        } else {
            return Character.toUpperCase(first) + s.substring(1);
        }
    }

    public String getImei() {
        return imei;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public String getApplicationVersion() {
        return appVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getOsName() {
        return osName;
    }

    public String getPhoneInfo() {
        return phoneInfo;
    }

    public String getApplicationName() {
        return applicationName;
    }
}

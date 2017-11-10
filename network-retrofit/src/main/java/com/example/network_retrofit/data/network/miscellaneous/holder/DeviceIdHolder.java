package com.example.network_retrofit.data.network.miscellaneous.holder;

import android.content.SharedPreferences;

/**
 * Created by mamba on 02.10.2017.
 */

public class DeviceIdHolder {
    static final String DEVICE_ID_KEY = "DEVICE_ID_KEY";
    static final int DEFAULT_DEVICE_ID_VALUE = 0;

    private static DeviceIdHolder instance;

    public static DeviceIdHolder getInstance() {
        if (instance == null) {
            throw new IllegalStateException("DeviceId holder has not been initialized!");
        } else {
            return instance;
        }
    }

    public static void init(SharedPreferences preferences) {
        instance = new DeviceIdHolder(preferences);
    }

    private DeviceIdHolder(SharedPreferences preferences) {
        if (preferences == null) {
            throw new IllegalArgumentException("Not null preferences required!");
        } else {
            int deviceId = preferences.getInt(DEVICE_ID_KEY, DEFAULT_DEVICE_ID_VALUE);
            this.preferences = preferences;

            if (deviceId != DEFAULT_DEVICE_ID_VALUE) {
                this.deviceId = deviceId;
            } else {
//                this.preferences = preferences;
            }
        }
    }

    private volatile int deviceId;
    private SharedPreferences preferences;

    public int getDeviceId() {
        return deviceId;
    }

    SharedPreferences getPreferences() {
        return preferences;
    }

    public synchronized void setDeviceId(int deviceId) {
        if (deviceId != DEFAULT_DEVICE_ID_VALUE) {
            this.deviceId = deviceId;
            if (preferences != null) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt(DEVICE_ID_KEY, deviceId);
                editor.commit();
            }
        }
    }
}

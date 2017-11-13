package com.example.network_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 29.09.2017.
 */

public class TestRequest{
    @SerializedName("@MsgNum")
    @Expose
    private final String messageNumber;
    @SerializedName("PhoneIMEI")
    @Expose
    private final String phoneImei;
    @SerializedName("Lng")
    @Expose
    private final String language;

    public TestRequest(String messageNumber, String phoneImei, String language) {
        this.messageNumber = messageNumber;
        this.phoneImei = phoneImei;
        this.language = language;
    }
}
package com.example.network_retrofit.data.network.miscellaneous.collectors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class ConfirmRequestDataCollector {
    @Expose
    @SerializedName("ConfirmPhone")
    protected String phone;
    @Expose @SerializedName("Email")
    protected String email;
    @Expose @SerializedName("SignScan")
    protected String sign;

    public ConfirmRequestDataCollector(String phone, String email, String sign) {
        this.sign = sign;
        this.phone = phone;
        this.email = email;
    }
}

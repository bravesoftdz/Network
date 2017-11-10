package com.example.network_retrofit.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public abstract class BaseSessionResponse extends BaseResponse {
    @Expose
    @SerializedName("SessionTimeout")
    private Integer sessionTimeout;

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }
}

package com.example.network_retrofit.data.response;

import com.example.network_retrofit.data.network.Mappable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public abstract class BaseResponse implements Mappable {
    @Expose
    @SerializedName("@MsgType")
    private String messageType;

    @Expose @SerializedName("@MsgNum")
    private String messageNumber;

    @Expose @SerializedName("ResultCode")
    private String resultCode;

    @Expose @SerializedName("ResultStr")
    private String resultString;

    public String getMessageType() {
        return messageType;
    }

    public String getMessageNumber() {
        return messageNumber;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultString() {
        return resultString;
    }
}

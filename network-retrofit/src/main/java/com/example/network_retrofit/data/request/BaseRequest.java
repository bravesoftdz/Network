package com.example.network_retrofit.data.request;

import com.example.network_retrofit.data.network.miscellaneous.MessageNumberGenerator;
import com.example.network_retrofit.data.network.miscellaneous.holder.DataHolder;
import com.example.network_retrofit.data.network.miscellaneous.holder.DeviceIdHolder;
import com.example.network_retrofit.data.network.Mappable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public abstract class BaseRequest implements Mappable {
    private static final String DEFAULT_MESSAGE_TYPE = "Request";

    @Expose
    @SerializedName("@MsgType")
    private String messageType;

    @Expose
    @SerializedName("@MsgNum")
    @SuppressWarnings("unused")
    private String messageNumber;

    @Expose
    @SerializedName("PhoneIMEI")
    @SuppressWarnings("unused")
    private String phoneImei;

    @Expose
    @SerializedName("Lang")
    @SuppressWarnings("unused")
    private String language;

    @Expose
    @SerializedName("DevID")
    protected Integer deviceId = null;

    protected BaseRequest() {
        this(DEFAULT_MESSAGE_TYPE);
    }

    public BaseRequest(String messageType) {
        this.messageType = messageType;
        messageNumber = MessageNumberGenerator.getInstance().getMessageNumber();
        phoneImei = DataHolder.getInstance().getDeviceInformationHolder().getImei();
        language = DataHolder.getInstance().getLanguageInformationHolder().getLanguage();
        deviceId = DeviceIdHolder.getInstance().getDeviceId();
    }
}

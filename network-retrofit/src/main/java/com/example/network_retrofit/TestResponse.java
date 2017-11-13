package com.example.network_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 29.09.2017.
 */

public class TestResponse {
    @SerializedName("@MsgNum")
    @Expose
    private String messageNumber;
    @SerializedName("ResultStr")
    @Expose
    private String resultString;
    @SerializedName("ResultCode")
    @Expose
    private String resultCode;
    @SerializedName("DevID")
    @Expose
    private String deviceId;
    @SerializedName("PhoneIMEI")
    @Expose
    private String phoneImei;
    @SerializedName("Info")
    @Expose
    private String information;

    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setPhoneImei(String phoneImei) {
        this.phoneImei = phoneImei;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestResponse that = (TestResponse) o;

        if (messageNumber != null ? !messageNumber.equals(that.messageNumber) : that.messageNumber != null)
            return false;
        if (resultString != null ? !resultString.equals(that.resultString) : that.resultString != null) return false;
        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (phoneImei != null ? !phoneImei.equals(that.phoneImei) : that.phoneImei != null) return false;
        return !(information != null ? !information.equals(that.information) : that.information != null);

    }

    @Override
    public int hashCode() {
        int result = messageNumber != null ? messageNumber.hashCode() : 0;
        result = 31 * result + (resultString != null ? resultString.hashCode() : 0);
        result = 31 * result + (resultCode != null ? resultCode.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (phoneImei != null ? phoneImei.hashCode() : 0);
        result = 31 * result + (information != null ? information.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return messageNumber + "/ " + resultString + "/ " +resultCode + "/ " + deviceId + "/ " + phoneImei;
    }
}

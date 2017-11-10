package com.example.network_retrofit.data.network.miscellaneous;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public abstract class PIDataAbstractHostResult {
    @Expose
    @SerializedName("HostResultCode")
    private String hostResultCode;

    @Expose @SerializedName("AuthCode")
    private String authCode;

    @Expose @SerializedName("RRN")
    private String rrn;

    @Expose @SerializedName("HostResultStr")
    private String hostResultString;

    @Expose @SerializedName("MerchantID")
    private String merchantId;

    @Expose @SerializedName("MerchantName")
    private String merchantName;

    @Expose @SerializedName("MerchantAddress")
    private String merchantAddress;

    @Expose @SerializedName("MerchantPhone")
    private String merchantPhone;

    @Expose @SerializedName("MerchantWeb")
    private String merchantWeb;

    @Expose @SerializedName("TerminalID")
    private String terminalId;

    @Expose @SerializedName("TerminalName")
    private String terminalName;

    @Expose @SerializedName("PAN")
    private String pan;

    @Expose @SerializedName("ExpDate")
    private String expiryDate;

    @Expose @SerializedName("CardHolderName")
    private String cardHolderName;

    @Expose @SerializedName("TypeCard")
    private String cardType;

    @Expose @SerializedName("TLV")
    private String tlv;

    @Expose @SerializedName("AppLabel")
    private String applicationLabel;

    @Expose @SerializedName("AppId")
    private String applicationId;

    public String getHostResultCode() {
        return hostResultCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public String getRrn() {
        return rrn;
    }

    public String getHostResultString() {
        return hostResultString;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public String getMerchantWeb() {
        return merchantWeb;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public String getPan() {
        return pan;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getTlv() {
        return tlv;
    }

    public String getApplicationLabel() {
        return applicationLabel;
    }

    public String getApplicationId() {
        return applicationId;
    }
}

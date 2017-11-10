package com.example.network_retrofit.data.network.miscellaneous.collectors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class CardRequestDataCollector {
    @Expose
    @SerializedName("CardHolderName")
    protected String cardHolderName;
    @Expose @SerializedName("ScreenHolderName")
    protected String screenHolderName;
    @Expose @SerializedName("TrackData")
    protected String trackData;
    @Expose @SerializedName("TrackLen")
    protected Integer trackLength;
    @Expose @SerializedName("TLV")
    protected String tlv;
    @Expose @SerializedName("KSN")
    protected String ksn;
    @Expose @SerializedName("PAN")
    protected String pan;
    @Expose @SerializedName("ExpDate")
    protected String expiryDate;
    @Expose @SerializedName("PinData")
    protected String pinData;
    // TODO: 10.05.2016 replace with enum
    @Expose @SerializedName("CardMethod")
    private String cardMethod;

    protected CardRequestDataCollector() {}

    public CardRequestDataCollector(String cardHolderName, String screenHolderName,
                                    String trackData, Integer trackLength, String tlv, String ksn,
                                    String pan, String expiryDate, String pinData, String cardMethod) {
        this.cardHolderName = cardHolderName;
        this.screenHolderName = screenHolderName;
        this.trackData = trackData;
        this.trackLength = trackLength;
        this.tlv = tlv;
        this.ksn = ksn;
        this.pan = pan;
        this.expiryDate = expiryDate;
        this.pinData = pinData;
        this.cardMethod = cardMethod;
    }
}

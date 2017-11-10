package com.example.network_retrofit.data.network.miscellaneous;

import com.example.network_retrofit.data.network.miscellaneous.enums.PIDataType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class PIdataContainer {

    //BaseDataCollector

    @Expose
    @SerializedName("@type")
    private String type;

    //PIDataReaderInformationCollector

    @Expose @SerializedName("PAN")
    protected String pan;
    @Expose @SerializedName("ExpDate")
    protected String expDate;
    @Expose @SerializedName("CardHolderName")
    protected String cardHolderName;
    @Expose @SerializedName("CardMethod")
    protected String cardMethod;
    @Expose @SerializedName("FALLBACK")
    protected String fallback;
    ///
    @Expose @SerializedName("rrn")
    protected String rrn;
    @Expose @SerializedName("ReceiptNumber")
    protected String receiptNumber;
    @Expose @SerializedName("ACD")
    protected String acd;
    @Expose @SerializedName("HostResponseCode")
    protected String hostResponseCode;
    @Expose @SerializedName("TerminalID")
    protected String terminalID;
    @Expose @SerializedName("PinEntry")
    protected Boolean pinEntry;
    @Expose @SerializedName("TerminalReceipt")
    protected String terminalReceipt;
    //
    @Expose @SerializedName("TrackData")
    protected String trackData;
    @Expose @SerializedName("TrackLen")
    protected String trackLen;
    @Expose @SerializedName("TLV")
    protected String tlv;
    @Expose @SerializedName("KSN")
    protected String ksn;
    @Expose @SerializedName("PinData")
    protected String pinData;
    @Expose @SerializedName("Rgid")
    protected Integer rgid;

    //PIDataReaderInformationCollector

    @Expose @SerializedName("SN")
    protected String sn;
    @Expose @SerializedName("RTP")
    protected String rtp;
    @Expose @SerializedName("ReaderNumber")
    protected String readerNumber;
    @Expose @SerializedName("FWVersion")
    protected String fWVersion;

    @Expose @SerializedName("IdentityCodeType")
    protected String identityCodeType;
    @Expose @SerializedName("BuyerIdentityCode")
    protected String buyerIdentityCode;

    @Expose @SerializedName("Email")
    protected String email;

    @Expose @SerializedName("@nm")
    private String nm;

    public PIdataContainer(PIDataType pIDataType, PIDataCardInformation pIDataCardInformation, PIDataReaderInformation pIDataReaderInformation) {
        //BaseDataCollector
        this.type = pIDataType.getTypePIData();
        //PIDataCardInformationCollector
        if(pIDataCardInformation != null) {
            this.pan = pIDataCardInformation.getPan();
            this.expDate = pIDataCardInformation.getExpDate();
            this.cardHolderName = pIDataCardInformation.getCardHolderName();
            this.cardMethod = pIDataCardInformation.getCardMethod();
            this.fallback = pIDataCardInformation.getFallback();
            this.rrn = pIDataCardInformation.getRrn();
            this.receiptNumber = pIDataCardInformation.getReceiptNumber();
            this.acd = pIDataCardInformation.getAcd();
            this.hostResponseCode = pIDataCardInformation.getHostResponseCode();
            this.terminalID = pIDataCardInformation.getTerminalID();
            this.pinEntry = pIDataCardInformation.getPinEntry();
            this.terminalReceipt = pIDataCardInformation.getTerminalReceipt();
            this.trackData = pIDataCardInformation.getTrackData();
            this.trackLen = pIDataCardInformation.getTrackLen();
            this.tlv = pIDataCardInformation.getTlv();
            this.ksn = pIDataCardInformation.getKsn();
            this.pinData = pIDataCardInformation.getPinData();
            this.rgid = pIDataCardInformation.getRgid();
        }
        if(pIDataReaderInformation != null) {
            //PIDataReaderInformationCollector
            this.sn = pIDataReaderInformation.getSN();
            this.rtp = pIDataReaderInformation.getRTP();
            this.readerNumber = pIDataReaderInformation.getReaderNumber();
            this.fWVersion = pIDataReaderInformation.getFWFersion();
        }
        if(pIDataType.getNamePIData() != null)
            nm = pIDataType.getNamePIData();
    }

    public PIdataContainer(PIDataType pIDataType, PIDataAlipayCode piDataAlipayCode) {
        type = pIDataType.getTypePIData();
        if(pIDataType.getNamePIData() != null)
            nm = pIDataType.getNamePIData();
        if(piDataAlipayCode != null && piDataAlipayCode.getType() != null)
            this.identityCodeType = piDataAlipayCode.getType();
        if(piDataAlipayCode != null && piDataAlipayCode.getCode() != null)
            this.buyerIdentityCode = piDataAlipayCode.getCode();
    }

    public void setEmail(String email) {
        if(email != null && !"".equals(email))
            this.email = email;
    }
}

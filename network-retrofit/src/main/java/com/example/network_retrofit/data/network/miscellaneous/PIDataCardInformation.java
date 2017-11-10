package com.example.network_retrofit.data.network.miscellaneous;

/**
 * Created by mamba on 02.10.2017.
 */

public class PIDataCardInformation {
    private String pan;

    private String expDate;

    private String cardHolderName;

    private String cardMethod;

    private String fallback;

    //host readers
    private String rrn;

    private String receiptNumber;

    private String acd;

    private String hostResponseCode;

    private String terminalID;

    private Boolean pinEntry;

    private String terminalReceipt;

    //normal readers
    private String trackData;

    private String trackLen;

    private String tlv;

    private String ksn;

    private String pinData;

    private Integer rgid;

    private PIDataCardInformation(PIDataCardInformation.Builder b) {
        pan = b.pan;
        expDate = b.expDate;
        cardHolderName = b.cardHolderName;
        cardMethod = b.cardMethod;
        fallback = b.fallback;
        rrn = b.rrn;
        receiptNumber = b.receiptNumber;
        acd = b.acd;
        hostResponseCode = b.hostResponseCode;
        terminalID = b.terminalID;
        pinEntry = b.pinEntry;
        terminalReceipt = b.terminalReceipt;
        trackData = b.trackData;
        trackLen = b.trackLen;
        tlv = b.tlv;
        ksn = b.ksn;
        pinData = b.pinData;
        rgid = b.rgid;
    }

    public String getPan() {
        return pan;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardMethod() {
        return cardMethod;
    }

    public String getFallback() {
        return fallback;
    }

    public String getRrn() {
        return rrn;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public String getAcd() {
        return acd;
    }

    public String getHostResponseCode() {
        return hostResponseCode;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public Boolean getPinEntry() {
        return pinEntry;
    }

    public String getTerminalReceipt() {
        return terminalReceipt;
    }

    public String getTrackData() {
        return trackData;
    }

    public String getTrackLen() {
        return trackLen;
    }

    public String getTlv() {
        return tlv;
    }

    public String getKsn() {
        return ksn;
    }

    public String getPinData() {
        return pinData;
    }

    public Integer getRgid() {
        return rgid;
    }

    public static class Builder {

        private String pan = null;

        private String expDate = null;

        private String cardHolderName = null;

        private String cardMethod = null;

        private String fallback = null;

        //host readers
        private String rrn = null;

        private String receiptNumber = null;

        private String acd = null;

        private String hostResponseCode = null;

        private String terminalID = null;

        private Boolean pinEntry = null;

        private String terminalReceipt = null;

        //normal readers
        private String trackData = null;

        private String trackLen = null;

        private String tlv = null;

        private String ksn = null;

        private String pinData = null;

        private Integer rgid = null;

        public PIDataCardInformation.Builder setPan(String pan) {
            this.pan = pan;
            return this;
        }

        public PIDataCardInformation.Builder setExpDate(String expDate) {
            this.expDate = expDate;
            return this;
        }

        public PIDataCardInformation.Builder setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public PIDataCardInformation.Builder setCardMethod(String cardMethod) {
            this.cardMethod = cardMethod;
            return this;
        }

        public PIDataCardInformation.Builder setFallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public PIDataCardInformation.Builder setRrn(String rrn) {
            this.rrn = rrn;
            return this;
        }

        public PIDataCardInformation.Builder setReceiptNumber(String receiptNumber) {
            this.receiptNumber = receiptNumber;
            return this;
        }

        public PIDataCardInformation.Builder setAcd(String acd) {
            this.acd = acd;
            return this;
        }

        public PIDataCardInformation.Builder setHostResponseCode(String hostResponseCode) {
            this.hostResponseCode = hostResponseCode;
            return this;
        }

        public PIDataCardInformation.Builder setTerminalID(String terminalID) {
            this.terminalID = terminalID;
            return this;
        }

        public PIDataCardInformation.Builder setPinEntry(Boolean pinEntry) {
            this.pinEntry = pinEntry;
            return this;
        }

        public PIDataCardInformation.Builder setTerminalReceipt(String terminalReceipt) {
            this.terminalReceipt = terminalReceipt;
            return this;
        }

        public PIDataCardInformation.Builder setTrackData(String trackData) {
            this.trackData = trackData;
            return this;
        }

        public PIDataCardInformation.Builder setTrackLen(String trackLen) {
            this.trackLen = trackLen;
            return this;
        }

        public PIDataCardInformation.Builder setTLV(String TLV) {
            this.tlv = TLV;
            return this;
        }

        public PIDataCardInformation.Builder setKsn(String ksn) {
            this.ksn = ksn;
            return this;
        }

        public PIDataCardInformation.Builder setPinData(String pinData) {
            this.pinData = pinData;
            return this;
        }

        public PIDataCardInformation.Builder setRgid(Integer rgid) {
            this.rgid = rgid;
            return this;
        }

        public PIDataCardInformation build() {
            return new PIDataCardInformation(this);
        }
    }
}

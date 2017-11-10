package com.example.network_retrofit.data.network.miscellaneous;

/**
 * Created by mamba on 02.10.2017.
 */

public class PIDataReaderInformation {
    private String SN;

    private String RTP;

    private String readerNumber;

    private String FWFersion;

    private PIDataReaderInformation(PIDataReaderInformation.Builder b) {
        this.SN = b.SN;
        this.RTP = b.RTP;
        this.readerNumber = b.readerNumber;
        this.FWFersion = b.FWFersion;
    }

    public String getSN() {
        return SN;
    }

    public String getRTP() {
        return RTP;
    }

    public String getReaderNumber() {
        return readerNumber;
    }

    public String getFWFersion() {
        return FWFersion;
    }

    public static class Builder {

        private String SN;

        private String RTP;

        private String readerNumber;

        private String FWFersion;

        public PIDataReaderInformation.Builder setSN(String SN) {
            this.SN = SN;
            return this;
        }

        public PIDataReaderInformation.Builder setRTP(String RTP) {
            this.RTP = RTP;
            return this;
        }

        public PIDataReaderInformation.Builder setReaderNumber(String readerNumber) {
            this.readerNumber = readerNumber;
            return this;
        }

        public PIDataReaderInformation.Builder setFWFersion(String FWFersion) {
            this.FWFersion = FWFersion;
            return this;
        }

        public PIDataReaderInformation build() {
            return new PIDataReaderInformation(this);
        }
    }
}

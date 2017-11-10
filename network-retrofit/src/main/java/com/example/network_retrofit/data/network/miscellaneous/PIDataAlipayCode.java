package com.example.network_retrofit.data.network.miscellaneous;

/**
 * Created by mamba on 02.10.2017.
 */

public class PIDataAlipayCode {
    private String type;

    private String code;

    private PIDataAlipayCode(PIDataAlipayCode.Builder b) {
        this.type = b.type;
        this.code = b.code;
    }

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public static class Builder {

        private String type;

        private String code;

        public PIDataAlipayCode.Builder setType(String type) {
            this.type = type;
            return this;
        }

        public PIDataAlipayCode.Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public PIDataAlipayCode build() {
            return new PIDataAlipayCode(this);
        }
    }
}

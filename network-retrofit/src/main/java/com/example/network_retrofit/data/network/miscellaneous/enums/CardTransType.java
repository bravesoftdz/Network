package com.example.network_retrofit.data.network.miscellaneous.enums;

/**
 * Created by mamba on 02.10.2017.
 */

public enum CardTransType {
    UNKNOWN("MANUAL"),
    CONTACT_EMV("EMV"),
    CONTACTLESS_EMV("NFC"),
    CONTACTLESS_TRACK("NFC"),
    MAGNETIC_STRIPE("TRACK");

    private final String code;

    private CardTransType(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public static CardTransType getByCode(String code) {
        CardTransType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CardTransType cardTransType = var1[var3];
            if(cardTransType.getCode().equals(code)) {
                return cardTransType;
            }
        }

        return UNKNOWN;
    }
}

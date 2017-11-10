package com.example.network_retrofit.data.network.miscellaneous.enums;

/**
 * Created by mamba on 02.10.2017.
 */

public enum TransactionMoneyType {
    UNKNOWN("UNKNOWN"), CARD("CARD"), CASH("CASH"), BOTH("BOTH"), ALIPAY("ALIPAY"), ECOM("ECOM");

    private String code;

    TransactionMoneyType(String code) {
        this.code = code;
    }

    public static TransactionMoneyType getEnumCode(String code) {

        if(code != null) {
            for(TransactionMoneyType transactionMoneyType : TransactionMoneyType.values()) {
                if(transactionMoneyType.getCode().equals(code))
                    return transactionMoneyType;
            }
        }
        return UNKNOWN;
    }

    public String getCode() {
        return code;
    }
}

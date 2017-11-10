package com.example.network_retrofit.data.network.miscellaneous.data;

import com.example.network_retrofit.data.network.miscellaneous.enums.PIDataType;
import com.example.network_retrofit.data.network.miscellaneous.enums.TransactionMoneyInteractionType;
import com.example.network_retrofit.data.network.miscellaneous.enums.TransactionMoneyType;

/**
 * Created by mamba on 02.10.2017.
 */

public class PIData {
    private PIDataType piDataType;

    public PIData(String name) {

    }

    public PIData(TransactionMoneyType transactionMoneyType, boolean host) {
        switch(transactionMoneyType){
            case CARD:
                this.piDataType = host ? PIDataType.HOST_CARD_STANDART : PIDataType.CARD_STANDART;
                break;
            case CASH:
                this.piDataType = PIDataType.CASH;
                break;
            case ALIPAY:
                this.piDataType = PIDataType.ALIPAY;
                break;
            case ECOM:
                this.piDataType = PIDataType.ECOM;
                break;
            default:
                this.piDataType = PIDataType.DEFAULT;
        }
    }

    public PIData(TransactionMoneyInteractionType transactionMoneyType, boolean host) {
        switch(transactionMoneyType){
            case CARD:
                this.piDataType = host ? PIDataType.HOST_CARD_STANDART : PIDataType.CARD_STANDART;
                break;
            case CASH:
                this.piDataType = PIDataType.CASH;
                break;
            case ALIPAY:
                this.piDataType = PIDataType.ALIPAY;
                break;
            case ECOM:
                this.piDataType = PIDataType.ECOM;
                break;
            default:
                this.piDataType = PIDataType.DEFAULT;
        }
    }

    public PIDataType getPiDataType() {
        return piDataType;
    }
}

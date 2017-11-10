package com.example.network_retrofit.data.network.miscellaneous.enums;

/**
 * Created by mamba on 02.10.2017.
 */

public enum PIDataType {
    DEFAULT(""), HOST_CARD_STANDART("Terminal", "Host"), CARD_STANDART("Terminal", "Server"), CASH("Cash"), ALIPAY("AliPay", "AliPay"), ECOM("CodeGeneration", "Ecom");

    private String typePIData;
    private String namePIData;

    PIDataType(String typePIData) {
        this.typePIData = typePIData;
    }

    PIDataType(String typePIData, String namePIData) {
        this.typePIData = typePIData;
        this.namePIData = namePIData;
    }

    public String getTypePIData() {
        return typePIData;
    }

    public String getNamePIData() {
        return namePIData;
    }

    public static PIDataType getPIDataType(String namePIData) {
        PIDataType pIDataType = PIDataType.DEFAULT;
        for(PIDataType pIDataTypeTemp: PIDataType.values()) {
            if(pIDataTypeTemp.getTypePIData().equalsIgnoreCase(namePIData)) {
                pIDataType = pIDataTypeTemp;
                break;
            }
        }
        return pIDataType;
    }

    public static PIDataType getPIDataType(String namePIData, String piDataType) {
        PIDataType pIDataType = PIDataType.DEFAULT;
        for(PIDataType pIDataTypeTemp: PIDataType.values()) {
            if(pIDataTypeTemp.getTypePIData().equalsIgnoreCase(piDataType) && (pIDataTypeTemp.getNamePIData() == null || pIDataTypeTemp.getNamePIData().equalsIgnoreCase(namePIData))) {
                pIDataType = pIDataTypeTemp;
                break;
            }
        }
        return pIDataType;
    }
}

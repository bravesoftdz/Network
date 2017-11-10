package com.example.network_retrofit.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class PaymentResponse extends AbstractTransactionResponse {
    @Expose
    @SerializedName("AuthAmount")
    private String amount;

    @Override
    public String getAmount() {
        return null;
    }
}

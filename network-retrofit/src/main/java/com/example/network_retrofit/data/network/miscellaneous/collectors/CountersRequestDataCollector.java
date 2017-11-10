package com.example.network_retrofit.data.network.miscellaneous.collectors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class CountersRequestDataCollector {
    @Expose
    @SerializedName("TransNum")
    protected Integer transactionNumber;
    @Expose @SerializedName("OperDayNum")
    protected Integer operationalDayNumber;
    @Expose @SerializedName("LastSuccessTrans")
    protected Integer lastSuccessfulTransactionNumber;

    public CountersRequestDataCollector(Integer transactionNumber, Integer operationalDayNumber,
                                        Integer lastSuccessfulTransactionNumber) {
        this.transactionNumber = transactionNumber;
        this.operationalDayNumber = operationalDayNumber;
        this.lastSuccessfulTransactionNumber = lastSuccessfulTransactionNumber;
    }
}

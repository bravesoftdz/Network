package com.example.network_retrofit.data.network.miscellaneous;

import com.example.network_retrofit.data.network.miscellaneous.enums.TransactionMoneyType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public class TransactionRequestDataCollector {
    @Expose
    @SerializedName("TransAmount")
    protected Long transactionAmount;
    /* Not used
    @Element(name = "Contract", required = false)
    protected String contract;
    */
    @Expose @SerializedName("ACD")
    protected String authorizationCode;
    @Expose @SerializedName("ReceiptNumber")
    protected String receiptNumber;
    @Expose @SerializedName("RRN")
    protected String rrn;
    @Expose @SerializedName("Cash")
    protected TransactionMoneyType transactionMoneyType;
    @Expose @SerializedName("FALLBACK")
    protected Boolean fallbackOperation;
    @Expose @SerializedName("CodeVal")
    protected String currencyCode;
    @Expose @SerializedName("OrigTransNum")
    protected Integer originalTransactionNumber;
    @Expose @SerializedName("OrigOperDayNum")
    protected Integer originalOperationalDayNumber;
    @Expose @SerializedName("TerminalID")
    private String terminalId;
    @Expose @SerializedName("PinEntry")
    private Boolean pinEntered;
    @Expose @SerializedName("HostResponseCode")
    private String hostResponseCode;
    @Expose @SerializedName("TerminalReceipt")
    private String terminalReceipt;

    public TransactionRequestDataCollector(Long transactionAmount, TransactionMoneyType transactionMoneyType,
                                           Boolean fallbackOperation, String currencyCode,
                                           Integer originalTransactionNumber,
                                           Integer originalOperationalDayNumber) {
        this.transactionAmount = transactionAmount;
        this.transactionMoneyType = transactionMoneyType;
        this.fallbackOperation = fallbackOperation;
        this.currencyCode = currencyCode;
        this.originalTransactionNumber = originalTransactionNumber;
        this.originalOperationalDayNumber = originalOperationalDayNumber;
    }

    public TransactionRequestDataCollector(Long transactionAmount, TransactionMoneyType transactionMoneyType,
                                           Boolean fallbackOperation, String currencyCode,
                                           Integer originalTransactionNumber,
                                           Integer originalOperationalDayNumber,
                                           String receiptNumber, String rrn,
                                           String authorizationCode, String terminalId,
                                           Boolean pinEntered, String hostResponseCode,
                                           String terminalReceipt) {
        this.transactionAmount = transactionAmount;
        this.transactionMoneyType = transactionMoneyType;
        this.fallbackOperation = fallbackOperation;
        this.currencyCode = currencyCode;
        this.originalTransactionNumber = originalTransactionNumber;
        this.originalOperationalDayNumber = originalOperationalDayNumber;
        this.receiptNumber = receiptNumber;
        this.rrn = rrn;
        this.authorizationCode = authorizationCode;
        this.terminalId = terminalId;
        this.pinEntered = pinEntered;
        this.hostResponseCode = hostResponseCode;
        this.terminalReceipt = terminalReceipt;
    }
}

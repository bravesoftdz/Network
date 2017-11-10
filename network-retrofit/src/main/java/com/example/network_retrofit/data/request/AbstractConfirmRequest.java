package com.example.network_retrofit.data.request;

import com.example.network_retrofit.data.network.miscellaneous.PIdataContainer;
import com.example.network_retrofit.data.network.miscellaneous.TransactionRequestDataCollector;
import com.example.network_retrofit.data.network.miscellaneous.collectors.CardRequestDataCollector;
import com.example.network_retrofit.data.network.miscellaneous.collectors.AuthorizationRequestDataCollector;
import com.example.network_retrofit.data.network.miscellaneous.collectors.ConfirmRequestDataCollector;
import com.example.network_retrofit.data.network.miscellaneous.collectors.CountersRequestDataCollector;
import com.example.network_retrofit.data.network.miscellaneous.data.ConfirmDto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mamba on 02.10.2017.
 */

public abstract class AbstractConfirmRequest extends BaseRequest{
    private static final String CONFIRM_MSG_TYPE = "Request";

    @Expose
    private AuthorizationRequestDataCollector authorizationRequestDataCollector;

    @Expose
    private CountersRequestDataCollector countersRequestDataCollector;

    @Expose
    private ConfirmRequestDataCollector confirmRequestDataCollector;

    @Expose
    private CardRequestDataCollector cardRequestDataCollector;

    @Expose
    private TransactionRequestDataCollector transactionRequestDataCollector;

    @Expose
    @SerializedName("PIData")
    PIdataContainer pIdataContainer;


    public AbstractConfirmRequest(ConfirmDto data) {
        this(CONFIRM_MSG_TYPE, data);
        pIdataContainer = new PIdataContainer(data.getPiData().getPiDataType(),
                null,
                null);
    }

    protected AbstractConfirmRequest(String msgType, ConfirmDto data) {
        super(msgType);
        authorizationRequestDataCollector = new AuthorizationRequestDataCollector(data.getLogin(), null, data
                .getSession(), null);
        countersRequestDataCollector = new CountersRequestDataCollector(data.getTransactionNumber(), data
                .getOperationalDayNumber(), null);
        confirmRequestDataCollector = new ConfirmRequestDataCollector(data.getPhone(), data.getEmail(), data
                .getSignature());
        cardRequestDataCollector = new CardRequestDataCollector(data.getCardHolderName(), null, null, null, null, null, data
                .getPan(), data.getExpiryDate(), null, data.getCardMethod());
        transactionRequestDataCollector = new TransactionRequestDataCollector(null, null, null, null, null, null, data
                .getReceiptNumber(), data.getRrn(), data.getAuthorizationCode(), data.getTerminalId(), data.isPinEntered(), null, null);
    }
}

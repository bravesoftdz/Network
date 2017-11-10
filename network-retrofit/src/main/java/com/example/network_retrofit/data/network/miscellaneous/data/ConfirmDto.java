package com.example.network_retrofit.data.network.miscellaneous.data;

import com.example.network_retrofit.data.network.miscellaneous.enums.CardTransType;

/**
 * Created by mamba on 02.10.2017.
 */

public class ConfirmDto {
    private final String login;
    private final String session;
    private final Integer transactionNumber;
    private final Integer operationalDayNumber;
    private final String phone;
    private final String email;
    private final String signature;
    private final String cardMethod;
    private final String cardHolderName;
    private final String rrn;
    private final String expiryDate;
    private final String receiptNumber;
    private final String pan;
    private final String authorizationCode;
    private final String terminalId;
    private final CardTransType cardEntryType;
    private final boolean pinEntered;
    private final PIData piData;

    public ConfirmDto(Builder b) {
        this.login = b.login;
        this.session = b.session;
        this.transactionNumber = b.transactionNumber;
        this.operationalDayNumber = b.operationalDayNumber;
        this.phone = b.phone;
        this.email = b.email;
        this.signature = b.signature;
        this.cardMethod = b.cardMethod;
        this.cardHolderName = b.cardHolderName;
        this.rrn = b.rrn;
        this.expiryDate = b.expiryDate;
        this.receiptNumber = b.receiptNumber;
        this.pan = b.pan;
        this.authorizationCode = b.authorizationCode;
        this.terminalId = b.terminalId;
        cardEntryType = b.cardEntryType;
        pinEntered = b.pinEntered;
        piData = b.piData;
    }

    public String getLogin() {
        return login;
    }

    public String getSession() {
        return session;
    }

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public Integer getOperationalDayNumber() {
        return operationalDayNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSignature() {
        return signature;
    }

    public String getCardMethod() {
        return cardMethod;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getRrn() {
        return rrn;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public String getPan() {
        return pan;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public CardTransType getCardEntryType() {
        return cardEntryType;
    }

    public boolean isPinEntered() {
        return pinEntered;
    }

    public PIData getPiData() {
        return piData;
    }

    public static class Builder {
        private String login;
        private String session;
        private Integer transactionNumber;
        private Integer operationalDayNumber;
        private String phone;
        private String email;
        private String signature;
        private String cardMethod;
        private String cardHolderName;
        private String rrn;
        private String expiryDate;
        private String receiptNumber;
        private String pan;
        private String authorizationCode;
        private String terminalId;
        private CardTransType cardEntryType;
        private boolean pinEntered;
        private PIData piData;

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder session(String session) {
            this.session = session;
            return this;
        }

        public Builder transactionNumber(Integer transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }

        public Builder operationalDayNumber(Integer operationalDayNumber) {
            this.operationalDayNumber = operationalDayNumber;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public Builder cardMethod(String cardMethod) {
            this.cardMethod = cardMethod;
            return this;
        }

        public Builder cardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public Builder rrn(String rrn) {
            this.rrn = rrn;
            return this;
        }

        public Builder expiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder receiptNumber(String receiptNumber) {
            this.receiptNumber = receiptNumber;
            return this;
        }

        public Builder pan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder authorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }

        public Builder terminalId(String terminalId) {
            this.terminalId = terminalId;
            return this;
        }

        public Builder cardEntryType(CardTransType cardEntryType) {
            this.cardEntryType = cardEntryType;
            return this;
        }

        public Builder pinEntered(boolean pinEntered) {
            this.pinEntered = pinEntered;
            return this;
        }

        public Builder piData(PIData piData) {
            this.piData = piData;
            return this;
        }

        public ConfirmDto build() {
            return new ConfirmDto(this);
        }
    }
}

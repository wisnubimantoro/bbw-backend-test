package com.bbw.apiva.dto;

public class PaymentRequestDTO {

    public Integer clientId;
    public Integer referenceNumber;
    public Integer virtualNumber;
    public Integer amount;
    public String note;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getVirtualNumber() {
        return virtualNumber;
    }

    public void setVirtualNumber(Integer virtualNumber) {
        this.virtualNumber = virtualNumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

package com.bbw.apiva.dto;

public class InquiryDTO {

    public Integer clientId;
    public Integer referenceNumber;
    public Integer virtualNumber;

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
}

package com.bbw.apiva.domain;

import javax.persistence.*;

@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REQUEST_SEQ")
    @Column(name = "request_id")
    private Integer requestId;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REFNUMBER_SEQ")
    @Column(name = "reference_number")
    private Integer referenceNumber;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = 00 + requestId;
    }

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = 00000000000 + referenceNumber;
    }
}

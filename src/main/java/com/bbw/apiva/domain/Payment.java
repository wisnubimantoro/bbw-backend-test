package com.bbw.apiva.domain;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_SEQ")
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "note")
    private String note;

    @Column(name = "transaction_number")
    private Integer transactionNumber;

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Integer transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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

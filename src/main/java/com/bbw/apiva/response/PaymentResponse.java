package com.bbw.apiva.response;

import com.bbw.apiva.dto.DataPayment;

public class PaymentResponse {

    public Integer rc;
    public String message;
    public DataPayment data;

    public Integer getRc() {
        return rc;
    }

    public void setRc(Integer rc) {
        this.rc = rc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataPayment getData() {
        return data;
    }

    public void setData(DataPayment data) {
        this.data = data;
    }
}

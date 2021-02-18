package com.bbw.apiva.response;

import com.bbw.apiva.dto.DataInquiry;

public class InquiryResponse {

    public Integer rc;
    public String message;
    public DataInquiry data;

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

    public DataInquiry getDataInquiry() {
        return data;
    }

    public void setDataInquiry(DataInquiry data) {
        this.data = data;
    }
}

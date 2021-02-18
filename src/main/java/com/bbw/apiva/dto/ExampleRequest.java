package com.bbw.apiva.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ExampleRequest {

    @NotNull @NotEmpty
    private String msiSdn;

    @NotNull @Min(10000)
    private BigDecimal nilai;

    public String getMsiSdn() {
        return msiSdn;
    }

    public void setMsiSdn(String msiSdn) {
        this.msiSdn = msiSdn;
    }

    public BigDecimal getNilai() {
        return nilai;
    }

    public void setNilai(BigDecimal nilai) {
        this.nilai = nilai;
    }
}

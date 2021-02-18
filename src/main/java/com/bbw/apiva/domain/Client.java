package com.bbw.apiva.domain;

import javax.persistence.*;

@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENT_SEQ")
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "virtual_account")
    private Integer virtualAccount;

    @Column(name = "account_name")
    private String accountName;

    public Integer getCliendId() {
        return clientId;
    }

    public void setCliendId(Integer clientId) {
        this.clientId = 00 + clientId;
    }

    public Integer getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(Integer virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}

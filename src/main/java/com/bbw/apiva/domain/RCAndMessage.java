package com.bbw.apiva.domain;

import javax.persistence.*;

@Table(name = "rc_and_message")
public class RCAndMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RCANDMESSAGE_SEQ")
    @Column(name = "id")
    private Integer id;

    @Column(name = "rc")
    private Integer rc;

    @Column(name = "message")
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}

package com.example.DemoSpringCloudStream.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Payment implements Serializable{

    @JsonProperty(value = "paymentId")
    private String paymentId;
    @JsonProperty(value = "paymentStatus")
    private String paymentStatus;
    @JsonProperty(value = "email")
    private String email;

    public Payment(){}

    public Payment(String paymentId, String paymentStatus, String email) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.email = email;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

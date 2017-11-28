package com.example.DemoSpringCloudStream.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GlobalProgressStream implements Serializable{

    @JsonProperty(value = "notificationId")
    private Integer notificationId;
    @JsonProperty(value = "firstUserId")
    private String firstUserId;
    @JsonProperty(value = "lastUserId")
    private String lastUserId;
    @JsonProperty(value = "successRecord")
    private Integer successRecord;
    @JsonProperty(value = "failedRecord")
    private Integer failedRecord;

    public GlobalProgressStream(Integer notificationId, String firstUserId, String lastUserId, Integer successRecord, Integer failedRecord) {
        this.notificationId = notificationId;
        this.firstUserId = firstUserId;
        this.lastUserId = lastUserId;
        this.successRecord = successRecord;
        this.failedRecord = failedRecord;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public String getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(String firstUserId) {
        this.firstUserId = firstUserId;
    }

    public String getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId;
    }

    public Integer getSuccessRecord() {
        return successRecord;
    }

    public void setSuccessRecord(Integer successRecord) {
        this.successRecord = successRecord;
    }

    public Integer getFailedRecord() {
        return failedRecord;
    }

    public void setFailedRecord(Integer failedRecord) {
        this.failedRecord = failedRecord;
    }

    @Override
    public String toString() {
        return "GlobalProgressStream{" +
                "notificationId=" + notificationId +
                ", firstUserId='" + firstUserId + '\'' +
                ", lastUserId='" + lastUserId + '\'' +
                ", successRecord=" + successRecord +
                ", failedRecord=" + failedRecord +
                '}';
    }
}

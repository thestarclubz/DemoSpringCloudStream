package com.example.DemoSpringCloudStream.model;


public class GlobalProgressStream{

    private Integer notificationId;
    private String firstUserId;
    private String lastUserId;
    private Integer successRecord;
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
}

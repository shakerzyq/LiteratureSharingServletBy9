package com.example.demo.background.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Work implements Serializable {
    private String WorkId;
    private String WorkName;
    private String WorkTime;
    private String Type;
    private String WorkContent;
    private int PushStatus;
    private int AuditStatus;
    private int WorkZan;
    private String UserId;

    public String getWorkId() {
        return WorkId;
    }

    public void setWorkId(String workId) {
        WorkId = workId;
    }

    public String getWorkName() {
        return WorkName;
    }

    public void setWorkName(String workName) {
        WorkName = workName;
    }

    public String getWorkTime() {
        return WorkTime;
    }

    public void setWorkTime(String workTime) {
        WorkTime = workTime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getWorkContent() {
        return WorkContent;
    }

    public void setWorkContent(String workContent) {
        WorkContent = workContent;
    }

    public int getPushStatus() {
        return PushStatus;
    }

    public void setPushStatus(int pushStatus) {
        PushStatus = pushStatus;
    }

    public int getAuditStatus() {
        return AuditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        AuditStatus = auditStatus;
    }

    public int getWorkZan() {
        return WorkZan;
    }

    public void setWorkZan(int workZan) {
        WorkZan = workZan;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}

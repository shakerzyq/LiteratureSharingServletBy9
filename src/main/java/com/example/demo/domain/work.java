package com.example.demo.domain;

public class work{
    private String workid;
    private String workname;
    private String workcontent;
    private String type;
    private String worktime;
    private int  pushstatus;
    private int auditstatus;
    private int workzan;
    private String userid;
    public work(){}
    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getWorkcontent() {
        return workcontent;
    }

    public void setWorkcontent(String workcontent) {
        this.workcontent = workcontent;
    }



    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(int pushstatus) {
        this.pushstatus = pushstatus;
    }

    public int getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(int auditstatus) {
        this.auditstatus = auditstatus;
    }

    public int getWorkzan() {
        return workzan;
    }

    public void setWorkzan(int workzan) {
        this.workzan = workzan;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}

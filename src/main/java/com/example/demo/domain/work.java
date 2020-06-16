package com.example.demo.domain;
public class work{
    private String workid;
    private String workname;
    private String workcontent;
    private int type;
    private String worktime;
    private String pushstatus;
    private String auditstatus;
    private int workzan;
    private String userid;
    public work(){}
    public work(String workid,String workname,String workcontent,String worktime,int workzan){
        this.workid=workid;
        this.workname=workname;
        this.workcontent=workcontent;
        this.worktime=worktime;
        this.workzan=workzan;
    }

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(String pushstatus) {
        this.pushstatus = pushstatus;
    }

    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
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

package com.example.demo.domain;

/**
 * @author 周杨清
 * @date 2020/6/12
 * 文件描述:
 */
public class WorkForFind {
    private String workid;
    private String workname;
    private String userid;
    private String username;



    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public WorkForFind(String workid, String workname, String userid) {
        this.workid = workid;
        this.workname = workname;
        this.userid = userid;
    }

    public WorkForFind() {
    }

    @Override
    public String toString() {
        return "WorkForFind{" +
                "workid='" + workid + '\'' +
                ", workname='" + workname + '\'' +
                ", userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

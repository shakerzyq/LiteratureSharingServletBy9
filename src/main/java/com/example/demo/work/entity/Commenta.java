package com.example.demo.work.entity;

import org.springframework.stereotype.Component;

/**
 * @author 周杨清
 * @date 2020/6/17
 * 文件描述:
 */

@Component
public class Commenta {
    private String workid;
    private String viewerid;
    private String content;
    private String reply;
    private String  date;
    private int zan;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getViewerid() {
        return viewerid;
    }

    public void setViewerid(String viewerid) {
        this.viewerid = viewerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }

    @Override
    public String toString() {
        return "Commenta{" +
                "workid='" + workid + '\'' +
                ", viewerid='" + viewerid + '\'' +
                ", content='" + content + '\'' +
                ", reply='" + reply + '\'' +
                ", date='" + date + '\'' +
                ", zan=" + zan +
                '}';
    }
}

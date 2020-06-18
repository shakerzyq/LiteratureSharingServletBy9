package com.example.demo.work.entity;


import org.springframework.stereotype.Component;

/**
 * @author 陆明鑫
 * @date 2020/6/9
 * 文件描述:作品评论   只显示必要信息
 */

@Component
public class CommentShow {
    private String viewerid;
    private String content;
    private String  time;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CommentShow{" +
                "viewerid='" + viewerid + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

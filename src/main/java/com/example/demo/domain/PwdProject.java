package com.example.demo.domain;

import org.springframework.stereotype.Component;

/**
 * @author 周杨清
 * @date 2020/6/6
 * 文件描述: 密保数据的实现类
 */
@Component
public class PwdProject {

    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
}


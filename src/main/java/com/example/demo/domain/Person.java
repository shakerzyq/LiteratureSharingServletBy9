package com.example.demo.domain;

import org.springframework.stereotype.Component;

/**
 * @author 周杨清
 * @date 2020/6/5
 * 文件描述:
 */
@Component
public class Person {
    private String username;
    private String password;
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

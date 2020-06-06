package com.example.demo.background.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Manager implements Serializable {
    private String managername;
    private String password;

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

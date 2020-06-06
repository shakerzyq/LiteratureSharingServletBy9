package com.example.demo.background.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/manager")
@RestController
public class ManagerLoginController {
    @RequestMapping("/login")
    public boolean managerLogin(@RequestBody JSONObject manager){
        //解析json
        String managername = manager.getString("managername");
        String password = manager.getString("password");
        //调用数据库
        System.out.println(managername+"--"+password);
        //判断登录是否成功
        if(managername == "123")
            return true;
        else
            return false;
    }
}

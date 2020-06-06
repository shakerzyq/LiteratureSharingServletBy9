package com.example.demo.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.background.dao.MLoginDao;
import com.example.demo.background.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘晓宇
 * @date 2020/6/6
 * 文件描述:管理员登录Controller
 */
@RequestMapping("/manager")
@RestController
public class ManagerLoginController {
    @Autowired
    private MLoginDao mLoginDao;
    @Autowired
    private Manager manager1;

    @RequestMapping("/login")
    public boolean managerLogin(@RequestBody JSONObject manager){
        //解析json
        manager1.setManagername(manager.getString("managername"));
        manager1.setPassword(manager.getString("password"));
        //调用数据库
        //判断登录是否成功
        if(mLoginDao.loginDao(manager1).size()==1)
            return true;
        else
            return false;
    }
}

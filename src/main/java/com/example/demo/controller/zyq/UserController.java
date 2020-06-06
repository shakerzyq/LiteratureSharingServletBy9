package com.example.demo.controller.zyq;

import com.example.demo.dao.zyq.UserDao;
import com.example.demo.domain.PwdProject;
import com.example.demo.domain.User;
//import com.example.demo.service.zyq.UserService;
import com.example.demo.service.zyq.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周杨清
 * @date 2020/6/5
 * 文件描述:
 */

@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    UserService userService;

    @Autowired
    User user1;

    @Autowired
    PwdProject pwdProject1;



    /**
     * 查询电话号码是否可用
     * @param id
     * @return
     */
    @RequestMapping("/user/{id}")
    public User getPerson(@PathVariable("id") String id){
        System.out.println("id为："+id);
        return userDao.findUserByid(id);
    }

    @RequestMapping("/user")
    public User insertUser(@RequestBody User user){
        System.out.println(user.getUserid());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getSex());
        System.out.println(user.getAutograph());
        System.out.println(user.getBirthday());
          user1 = userService.insertUser(user);
        return user1;
    }
    @RequestMapping("/pwdprotect")
    public User insertPwdProtect(@RequestBody PwdProject pwdProject) {
        System.out.println(pwdProject.getUserid());
        System.out.println(pwdProject.getQuestion1());
        System.out.println(pwdProject.getAnswer1());
        System.out.println(pwdProject.getQuestion2());
        System.out.println(pwdProject.getAnswer2());
        pwdProject1 = userService.insertPwdProtect(pwdProject);
        return user1;
    }

}

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
        return userDao.findUserByid(id);
    }

    /**
     * 注册功能，插入用户
     * @param user
     * @return
     */
    @RequestMapping("/user")
    public User insertUser(@RequestBody User user){
          user1 = userService.insertUser(user);
        return user1;
    }

    /**
     * 注册功能，插入用户密保
     * @param pwdProject
     * @return
     */
    @RequestMapping("/user/pwdprotect")
    public User insertPwdProtect(@RequestBody PwdProject pwdProject) {
        pwdProject1 = userService.insertPwdProtect(pwdProject);
        return user1;
    }

    /**
     * 获取账号对应的密保信息
     * @param id  传递过来的用户账号
     * @return
     */
    @RequestMapping("/findpwd/{id}")
    public PwdProject GetQuestion(@PathVariable("id") String id){
        pwdProject1=userDao.findQuestionByid(id);
        return pwdProject1;
    }

    /**
     * 登录判定
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public User UserLogin(@RequestBody User user){
         user1 = userService.loginCheck(user);
        return user1;
    }
}

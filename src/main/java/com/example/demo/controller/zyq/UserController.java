package com.example.demo.controller.zyq;

import com.example.demo.dao.zyq.UserDao;
import com.example.demo.domain.Person;
//import com.example.demo.service.zyq.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    UserDao userService;

    /**
     * 查询电话号码是否可用
     * @param id
     * @return
     */
    @RequestMapping("/user/{id}")
    public Person getPerson(@PathVariable("id") String id){
        System.out.println("id为："+id);
        return userService.findUserByid(id);
    }

   /* @RequestMapping("/user")
    public Person insertUser(Person person){
        userDao.insertUser(person);
        return person;
    }*/
}

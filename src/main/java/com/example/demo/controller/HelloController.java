package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 周杨清
 * @date 2020/6/4
 * 文件描述:
 */


/*@ResponseBody//把helloworld写给浏览器
@Controller*/
@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    User person = new User();

    @RequestMapping("/hello")
    public User hello(){
        person.setPassword("123");
        person.setUsername("rick");
        return person;
    }
    @RequestMapping("/query")
    public Map<String,Object> findAll(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from user");
        return list.get(0);
    }
}

package com.example.demo.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.background.dao.WorkQueryDao;
import com.example.demo.background.entity.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author 刘晓宇
 * @date 2020/6/8
 * 文件描述:管理员查询作品Controller
 */
@RequestMapping("/workmanager")
@RestController
public class WorkQueryController {
    //注入数据库
    @Autowired
    private WorkQueryDao workQueryDao;
    //实体list
    private ArrayList<Work> works = new ArrayList<Work>();
    //json
    private JSONObject json = new JSONObject();

    //传递的JSON
    private List<JSONObject> list = new ArrayList<JSONObject>();

    @RequestMapping("/query")
    public JSONObject queryWork(@RequestParam String type){
        System.out.println(type);
        //查询所有
        if(type.equals("all")){
            works=workQueryDao.queryAll();
            //包装成为Json
            json.put("data",works);
        }
        else{
            if(type.equals("check"))
            {
                works=workQueryDao.queryCheck();
                //包装成为Json
                json.put("data",works);
            }
            else
                System.out.println("查询类别错误");
        }

        return json;
    }

}

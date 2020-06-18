package com.example.demo.work.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.background.entity.Work;
import com.example.demo.dao.zyq.WorkFindDao;
import com.example.demo.domain.WorkForFind;
import com.example.demo.work.dao.WorkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WorkController {

    //注入数据库
    @Autowired
    private WorkDao workDao;
    //json
    private JSONObject json = new JSONObject();

    @Autowired
    WorkFindDao workFindDao;



    //查询作品详细内容
    @RequestMapping("/work/{id}")
    public Work queryWork(@PathVariable("id") String workid){
        Work work = workDao.queryWork(workid);
        return work;
    }
    //推荐
    @RequestMapping("/push")
    @ResponseBody
    public List<WorkForFind> queryPush(){
        List<WorkForFind> works = workDao.queryPush();
        for(WorkForFind workForFind:works){
            System.out.println(workForFind);
            workForFind.setUsername(workFindDao.findUserNameById(workForFind.getUserid()));
        }
        return works;
    }

    //点赞操作
    @RequestMapping("/dianzan/{id}")
    public String dianzan(@PathVariable("id") String num){
        String[] strlist = num.split(",");
        workDao.dianzan(strlist[0],strlist[1]);
        return "点赞成功";
    }
}

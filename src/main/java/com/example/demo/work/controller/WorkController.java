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




    @RequestMapping("/work/{id}")
    public Work queryWork(@PathVariable("id") String workid){

        System.out.println("作品iD:   "+workid);

        Work work = workDao.queryWork(workid);
        System.out.println("作品内容:"+work);
        return work;
    }
//推荐
    @RequestMapping("/push")
    @ResponseBody
    public List<WorkForFind> queryPush(){
        System.out.println("推荐界面");
        List<WorkForFind> works = workDao.queryPush();

        for(WorkForFind workForFind:works){
            System.out.println(workForFind);
            workForFind.setUsername(workFindDao.findUserNameById(workForFind.getUserid()));
        }
        System.out.println("查询出的推荐内容:"+works);
        //json.put("data",works);

        return works;

    }

    //点赞操作
    @RequestMapping("/dianzan/{id}")
    public String dianzan(@PathVariable("id") String num){
        System.out.println("传递过来的点赞信息为:  "+num);
        String[] strlist = num.split(",");
        workDao.dianzan(strlist[0],strlist[1]);
        return "点赞成功";
    }


}

package com.example.demo.controller.zyq;

import com.example.demo.domain.WorkForFind;
import com.example.demo.service.zyq.WorkFindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/12
 * 文件描述:
 */
@Controller
public class WorkFindController {

    @Autowired
    WorkFindService workFindService;



    @RequestMapping("/FindWorksByType/{id}")
    @ResponseBody
    public List<WorkForFind> findWorksByType(@PathVariable("id") String type){
        System.out.println("类型为"+type);
        List<WorkForFind> workForFinds = workFindService.findWorksByType(type);
        System.out.println(workForFinds);
        for (WorkForFind workForFind:workForFinds){
            System.out.println("controller:   "+workForFind);
        }
        return workForFinds;
    }

    @RequestMapping("/FindWorks/{id}")
    @ResponseBody
    public List<WorkForFind> findWorksUp(@PathVariable("id") String id){
        System.out.println("搜索的内容为"+id);
        List<WorkForFind> workForFinds = workFindService.findWorks(id);
        System.out.println(workForFinds);
        for (WorkForFind workForFind:workForFinds){
            System.out.println(workForFind);
        }
        return workForFinds;
    }
}

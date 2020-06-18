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

    /**
     * 通过类型查找文章
     * @param type
     * @return
     */
    @RequestMapping("/FindWorksByType/{id}")
    @ResponseBody
    public List<WorkForFind> findWorksByType(@PathVariable("id") String type){
        List<WorkForFind> workForFinds = workFindService.findWorksByType(type);
        for (WorkForFind workForFind:workForFinds){
            System.out.println("controller:   "+workForFind);
        }
        return workForFinds;
    }

    /**
     * 通过名字和内容模糊查询文章
     * @param id
     * @return
     */
    @RequestMapping("/FindWorks/{id}")
    @ResponseBody
    public List<WorkForFind> findWorksUp(@PathVariable("id") String id){
        List<WorkForFind> workForFinds = workFindService.findWorks(id);
        for (WorkForFind workForFind:workForFinds){
            System.out.println(workForFind);
        }
        return workForFinds;
    }
}

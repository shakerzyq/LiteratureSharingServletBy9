package com.example.demo.work.controller;

import com.example.demo.work.entity.CommentShow;
import com.example.demo.work.entity.Commenta;
import com.example.demo.work.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/17
 * 文件描述:
 */

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;



    /**
     * 提交评论
     * @return
     */
    @RequestMapping("/commitConmment")
    public String commitComment(@RequestBody Commenta commenta){


        System.out.println("传过来的评论信息为:"+commenta);
        String result = commentService.commitComment(commenta);
        if (result!=null){
            return result;
        }
        return null;

    }

    @RequestMapping("/comment/{id}")
    public List<CommentShow> findComment(@PathVariable("id") String workid){

        System.out.println("查询评论接受的workid为:"+workid);
        List<CommentShow> commenta =commentService.findComment(workid);

        System.out.println("查询结果为"+commenta);
       /* List<CommentShow> comments = new ArrayList<CommentShow>();
        for(CommentShow commenta1:commenta){
            System.out.println(commenta1);

            workForFind.setUsername(workFindDao.findUserNameById(workForFind.getUserid()));
        }*/
       return commenta;

    }
}

package com.example.demo.work.service;

import com.example.demo.work.dao.CommentDao;
import com.example.demo.work.entity.CommentShow;
import com.example.demo.work.entity.Commenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/17
 * 文件描述:
 */
@Service
public class CommentService {

    @Autowired
    CommentDao commentDao;

    @Autowired
    CommentShow comment;

    @Autowired
    Commenta commenta;

    //插入评论
    public String commitComment(Commenta commenta) {
        //用于给评论生成随机id
        String x="";
        for(int n=0;n<10;n++ ) {
            x+=(int)(10*(Math.random()));
        }
        commenta.setId(x);
        int result = commentDao.insertComment(commenta);
        if(result==1){
            return "success";
        }else{
            return null;
        }
    }

    //显示评论
    public List<CommentShow> findComment(String workid) {
        List<CommentShow> comments=  commentDao.selectComment(workid);
        for(CommentShow commentShow: comments){
            System.out.println(commentShow);
            commentShow.setUsername(commentDao.findUserNameById(commentShow.getViewerid()));
        }
        return comments;

    }
}

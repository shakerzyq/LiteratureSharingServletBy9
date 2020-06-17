package com.example.demo.work.dao;

import com.example.demo.work.entity.CommentShow;
import com.example.demo.work.entity.Commenta;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/17
 * 文件描述:
 */

@Component
@Mapper
public interface CommentDao {

    //插入评论
    @Insert("insert into Comment (id,workid,viewerid,content,reply,time,zan) values(#{id},#{workid},#{viewerid},#{content},#{reply},#{date},#{zan})")
    public int insertComment(Commenta commenta);

    //查询评论
    @Select("select viewerid,content,time from comment where workid=#{workid}")
    public List<CommentShow> selectComment(String workid);

    //查询用户名
    @Select("select username from user where userid=#{writerid}")
    String findUserNameById(String writerid);
}

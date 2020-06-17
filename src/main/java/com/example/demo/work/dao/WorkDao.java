package com.example.demo.work.dao;

import com.example.demo.background.entity.Work;

import com.example.demo.dao.zyq.WorkFindDao;
import com.example.demo.domain.WorkForFind;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author 陆明鑫
 * @date 2020/6/9
 * 文件描述:作品
 */
@Component
@Mapper
public interface WorkDao {

    //根据作品Id查询作品信息
    @Select("select * from work where workid=#{workid}")
    public Work queryWork(String WorkId);
    //根据作品推送状态查询作品信息
    @Select("select workid,workname,userid from work where pushstatus = 1")
    public List<WorkForFind> queryPush();

    //作品点赞数
    @Update("update work set workzan=#{num} where workid=#{workid}")
    public int dianzan(String num,String workid);
}

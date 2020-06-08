package com.example.demo.background.dao;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.background.entity.Work;
import netscape.javascript.JSObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Mapper
public interface WorkQueryDao {
    //查询所有作品
    @Select("select * from work")
    public ArrayList<Work> queryAll();

    //查询待审查作品
    @Select("select * from work where AuditStatus = 0")
    public ArrayList<Work> queryCheck();

}

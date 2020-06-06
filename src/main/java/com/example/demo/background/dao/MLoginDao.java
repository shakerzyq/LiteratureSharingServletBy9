package com.example.demo.background.dao;

import com.example.demo.background.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MLoginDao {
    //登录验证
    @Select("select * from manager where managername=#{managername} and password=#{password}")
    public List<Manager> loginDao(Manager manager);
}

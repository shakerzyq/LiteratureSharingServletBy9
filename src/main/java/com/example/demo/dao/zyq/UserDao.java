package com.example.demo.dao.zyq;

import com.example.demo.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author 周杨清
 * @date 2020/6/5
 * 文件描述:
 */
//指定这是一个操作数据库的mapper

@Component
@Mapper
public interface UserDao {
    @Select("select * from user where account=#{id}")
    public Person findUserByid(String id);

  /*  @Select("delete from department where account=#{id}")
    public int deleteUserByid(String id);*/

    /*@Insert("insert into user(account,password,username) values(#{account,password,username})")
    public int insertUser(Person person);

    @Update("update user set username=#{username} where account=#{account}")
    public int updateUser(Person person);*/
}

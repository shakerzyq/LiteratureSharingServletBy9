package com.example.demo.dao.zyq;

import com.example.demo.domain.PwdProject;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
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
    //验证是否存在账号
    @Select("select * from user where userid=#{id}")
    public User findUserByid(String id);

  /*  @Select("delete from department where account=#{id}")
    public int deleteUserByid(String id);*/

    //插入注册信息
    @Insert("insert into user (userid,username,password,birthday,sex,autograph) values(#{userid},#{username},#{password},#{birthday},#{sex},#{autograph})")
    public int insertUser(User user);

    //插入密保数据
    @Insert("insert into pwdprotect (question1,answer1,question2,answer2,userid) values(#{question1},#{answer1},#{question2},#{answer2},#{userid})")
    int insertPwdProtect(PwdProject pwdProject);


    /*@Update("update user set username=#{username} where account=#{account}")
    public int updateUser(Person person);*/
}

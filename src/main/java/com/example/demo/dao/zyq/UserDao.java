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

    //查询用户的密保
    @Select("select question1,answer1,question2,answer2,userid from pwdprotect where userid=#{id}")
    public PwdProject findQuestionByid(String id);

    //插入注册信息
    @Insert("insert into user (userid,username,password,birthday,sex,autograph) values(#{userid},#{username},#{password},#{birthday},#{sex},#{autograph})")
    public int insertUser(User user);

    //插入密保数据
    @Insert("insert into pwdprotect (question1,answer1,question2,answer2,userid) values(#{question1},#{answer1},#{question2},#{answer2},#{userid})")
    int insertPwdProtect(PwdProject pwdProject);

    //验证账号密码是否正确
    @Select("select * from user where userid=#{userid} and password=#{password}")
    User selectUser(User user);

    //查询用户数
    @Select("select count(userid) from user")
    public int selectUsernum();
}

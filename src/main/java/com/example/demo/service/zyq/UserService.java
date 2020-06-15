package com.example.demo.service.zyq;

import com.example.demo.dao.zyq.UserDao;
import com.example.demo.domain.PwdProject;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 周杨清
 * @date 2020/6/5
 * 文件描述:
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    User user1;

    /**
     * 注册   用户基本信息插入
     * @param user
     * @return
     */
    public User insertUser(User user) {
        int result = userDao.insertUser(user);
        if (result==0){
            return null;
        }else{
            return user;
        }
    }

    /**
     * 注册    插入用户密保
     * @param pwdProject
     * @return
     */
    public PwdProject insertPwdProtect(PwdProject pwdProject) {
        int result = userDao.insertPwdProtect(pwdProject);
        if (result==0){
            return null;
        }else{
            return pwdProject;
        }
    }

    /**
     * 调用持久层,对返回的结果进行逻辑判断
     * @param user
     * @return
     */
    public User loginCheck(User user) {
        user1=userDao.selectUser(user);
        if(userDao.selectUser(user)!=null){
            return user1;
        }else{
            return null;
        }

    }
}

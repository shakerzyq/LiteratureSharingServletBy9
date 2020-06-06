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

    public User insertUser(User user) {
        int result = userDao.insertUser(user);
        if (result==0){
            return null;
        }else{
            return user;
        }
    }

    public PwdProject insertPwdProtect(PwdProject pwdProject) {
        int result = userDao.insertPwdProtect(pwdProject);
        if (result==0){
            return null;
        }else{
            return pwdProject;
        }
    }
}

package com.example.demo.dao.zyq;

import com.example.demo.domain.User;
import com.example.demo.domain.WorkForFind;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/12
 * 文件描述:
 */

@Component
@Mapper
public interface WorkFindDao {


    //通过类型查询作品
    @Select("select workid,workname,userid from work where auditstatus=1 and type=#{type} ")
    public List<WorkForFind> findWorkByid(String type);

    //验证是否存在账号
    @Select("select username from user where userid=#{writerid}")
    String findUserNameById(String writerid);

    //模糊查询作品
    @Select("select workid,workname,userid from work where auditstatus=1 and workname like #{id}")
    List<WorkForFind> findWorks(String id);


}

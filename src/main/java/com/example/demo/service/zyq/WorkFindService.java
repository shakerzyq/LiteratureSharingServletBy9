package com.example.demo.service.zyq;

import com.example.demo.dao.zyq.WorkFindDao;
import com.example.demo.domain.WorkForFind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 周杨清
 * @date 2020/6/12
 * 文件描述:
 */
@Service
public class WorkFindService {

    @Autowired
    WorkFindDao workFindDao;

    /**
     * 通过类型查找文章
     * @param type
     * @return
     */
    public List<WorkForFind> findWorksByType(String type) {
        List<WorkForFind> workForFinds = workFindDao.findWorkByid(type);
        for(WorkForFind workForFind:workForFinds){
            System.out.println(workForFind);
            workForFind.setUsername(workFindDao.findUserNameById(workForFind.getUserid()));
        }
        return workForFinds;
    }

    /**
     * 通过名字和内容模糊查询文章
     * @param id
     * @return
     */
    public List<WorkForFind> findWorks(String id) {
        id="%"+id+"%";
        List<WorkForFind> workForFinds = workFindDao.findWorks(id);

        for(WorkForFind workForFind:workForFinds){
            System.out.println(workForFind);
            workForFind.setUsername(workFindDao.findUserNameById(workForFind.getUserid()));
        }
        return workForFinds;
    }
}

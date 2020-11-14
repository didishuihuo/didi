package com.bjpowernode.homewk.service;

import com.bjpowernode.homewk.bean.TClass;
import com.bjpowernode.homewk.dao.IClassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassService implements IClassService {
    @Autowired
    IClassDao classDao;


    @Override
    public int delete(Integer cid) {
        return classDao.deleteByPrimaryKey(cid);
    }

    @Override
    public int save(TClass record) {
        return classDao.insert(record);
    }

    @Override
    public TClass get(Integer cid) {
        return classDao.selectByPrimaryKey(cid);
    }

    @Override
    public List<TClass> list() {
        return classDao.selectAll();
    }

    @Override
    public int update(TClass record) {
        return classDao.updateByPrimaryKey(record);
    }
}

package com.bjpowernode.homewk.dao;

import com.bjpowernode.homewk.bean.TClass;

import java.util.List;

public interface IClassDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(TClass record);

    int insertSelective(TClass record);

    TClass selectByPrimaryKey(Integer cid);

    List<TClass> selectAll();

    int updateByPrimaryKeySelective(TClass record);

    int updateByPrimaryKey(TClass record);
}
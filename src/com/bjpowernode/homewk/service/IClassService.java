package com.bjpowernode.homewk.service;

import com.bjpowernode.homewk.bean.TClass;

import java.util.List;

public interface IClassService {


    int delete(Integer cid);

    int save(TClass record);

    TClass get(Integer cid);

    List<TClass> list();

    int update(TClass record);


}

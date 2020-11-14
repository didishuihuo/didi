package com.bjpowernode.homewk.controller;

import com.bjpowernode.homewk.bean.TClass;
import com.bjpowernode.homewk.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    IClassService classService;


    public void delete(Integer cid){
        classService.delete(cid);
    }

    public void save(TClass record){
        classService.save(record);
    }

    public TClass get(Integer cid){
        return classService.get(cid);
    }

    public List<TClass> list(){
        return classService.list();
    }

    public int update(TClass record){
        return classService.update(record);
    }


}

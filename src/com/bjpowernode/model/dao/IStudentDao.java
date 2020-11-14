package com.bjpowernode.model.dao;

import com.bjpowernode.model.bean.Student;

import java.util.List;

public interface IStudentDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    List<Student> selectAll();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
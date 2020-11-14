package com.bjpowernode.model.service;

import com.bjpowernode.model.bean.Student;

import java.util.List;

public interface IStudentService {

    void save(Student student);

    void update(Student student);

    void delete(int sid);

    List<Student> list();

    Student get(int sid);


}

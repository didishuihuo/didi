package com.bjpowernode.model.controller;

import com.bjpowernode.model.bean.Student;
import com.bjpowernode.model.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class StudentController {
    @Autowired
    IStudentService studentService;

    public List<Student> list(){
        return studentService.list();
    }

    public Student get(int sid){
        return studentService.get(sid);
    }

    public void save(Student student){
        studentService.save(student);
    }

    public void update(Student student){
        studentService.update(student);
    }

    public void delete(int sid){
        studentService.delete(sid);
    }





}

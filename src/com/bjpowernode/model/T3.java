package com.bjpowernode.model;

import com.bjpowernode.model.bean.Student;
import com.bjpowernode.model.controller.StudentController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class T3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml","spring-datasource.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        List<Student> list = studentController.list();
        for (Student student : list) {
            System.out.println(student.getSid() + "," + student.getSname() + "," + student.getSex() + "," + student.getAge());
        }

    }
}

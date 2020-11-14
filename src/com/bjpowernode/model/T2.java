package com.bjpowernode.model;

import com.bjpowernode.model.bean.Student;
import com.bjpowernode.model.dao.IStudentDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class T2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-datasource.xml");

        IStudentDao studentDao = applicationContext.getBean(IStudentDao.class);
        List<Student> students = studentDao.selectAll();
        System.out.println(students);

    }
}

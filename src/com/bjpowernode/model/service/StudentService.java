package com.bjpowernode.model.service;

import com.bjpowernode.model.bean.Student;
import com.bjpowernode.model.dao.IStudentDao;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {


    @Autowired
    private IStudentDao studentDao;



    public static void main(String[] args) {
        StudentService studentService = new StudentService();
    }

    @Override
    public void save(Student student) {
        studentDao.insert(student);
    }

    @Override
    public void update(Student student) {
        studentDao.updateByPrimaryKey(student);
    }

    @Override
    public void delete(int sid) {
        studentDao.deleteByPrimaryKey(sid);
    }

    @Override
    public List<Student> list() {
        return studentDao.selectAll();
    }

    @Override
    public Student get(int sid) {
        return studentDao.selectByPrimaryKey(sid);
    }
}

package com.niit.springbootjpa.service.impl;

import com.niit.springbootjpa.entity.Student;
import com.niit.springbootjpa.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Test
    public void save() {
        Student student = new Student();
        student.setStuName("测试学生");
        student.setStuAge(20);
        System.out.println(student);
        System.out.println(studentService.save(student));
    }

    @Test
    public void getAll() {
        List<Student> studentList = studentService.getAll();
        studentList.forEach(student -> System.out.println(student));
    }

    @Test
    public void get() {
        System.out.println(studentService.get(8));
    }

    @Test
    public void delete() {
        studentService.delete(8);
    }
}
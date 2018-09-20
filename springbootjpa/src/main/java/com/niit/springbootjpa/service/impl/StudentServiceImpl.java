package com.niit.springbootjpa.service.impl;

import com.niit.springbootjpa.dao.StudentRepository;
import com.niit.springbootjpa.entity.Student;
import com.niit.springbootjpa.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}

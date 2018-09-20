package com.niit.springbootjpa.web;

import com.niit.springbootjpa.entity.Student;
import com.niit.springbootjpa.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Integer id) {
        return studentService.get(id);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }

//    @PostMapping(value = "/save")
//    public String save(@RequestParam String name, @RequestParam int age) {
//        Student student = new Student();
//        student.setStuName(name);
//        student.setStuAge(age);
//        return studentService.save(student).toString();
//    }


}

package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("stu")
public class StuController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("addStu")
    public String insertStu(){
        Student student=new Student(null,"ww",12,new Date(),1);
        studentService.insertStu(student);
        return "succ";
    }
}

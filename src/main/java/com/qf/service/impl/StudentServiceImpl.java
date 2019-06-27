package com.qf.service.impl;

import com.qf.dao.StudentMapper;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public Integer insertStu(Student student) {
        studentMapper.insertStu(student);
        return 0;

    }
}

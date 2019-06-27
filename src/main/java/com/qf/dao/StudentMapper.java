package com.qf.dao;

import com.qf.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Integer insertStu(Student student);
}

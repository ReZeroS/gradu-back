package com.rezero.gradu.service;

import com.rezero.gradu.entity.Student;

public interface StudentService {

    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}

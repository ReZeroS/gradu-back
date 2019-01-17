package com.rezero.gradu.service.impl;


import com.rezero.gradu.entity.Student;
import com.rezero.gradu.mapper.mysql.StudentMapper;
import com.rezero.gradu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public void deleteStudentBySno(String sno) {

    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }
}

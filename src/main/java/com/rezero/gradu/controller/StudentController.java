package com.rezero.gradu.controller;


import com.rezero.gradu.entity.Student;
import com.rezero.gradu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.Api;

//@Api(value = "用户Controller")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/querystudent")
    public Student queryStudentBySno(String sno) {
        return this.studentService.queryStudentBySno(sno);
    }




}

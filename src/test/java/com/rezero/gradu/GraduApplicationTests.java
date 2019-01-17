package com.rezero.gradu;

import com.rezero.gradu.entity.Student;
import com.rezero.gradu.entity.User;
import com.rezero.gradu.service.StudentService;
import com.rezero.gradu.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraduApplicationTests {
    @Autowired
    StudentService studentService;

    @Test
    public void test() {
        Student user = this.studentService.queryStudentBySno("001");
        Assert.assertEquals("用户名为scott", "KangKang", user.getName());
    }
}

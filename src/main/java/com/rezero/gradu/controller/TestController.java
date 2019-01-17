package com.rezero.gradu.controller;


import com.rezero.gradu.entity.User;
import com.rezero.gradu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8000", methods = RequestMethod.GET)
@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;


    @RequestMapping("query")
    public List<User> queryStudents(){
        logger.info("query...");
        return this.userService.findAllUsers();
    }




}

package com.rezero.gradu.controller;


import com.rezero.gradu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("query")
    public List<Map<String, Object>> queryStudentsFromOracle(){
        return this.userService.getAllUsersFromOralce();
    }




}

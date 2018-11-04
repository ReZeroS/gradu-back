package com.rezero.gradu.controller;


import com.rezero.gradu.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllrt {

    @Autowired
    private Config config;

    @RequestMapping("/")
    String index(){
        return config.toString();
    }


}

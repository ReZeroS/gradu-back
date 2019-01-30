package com.rezero.gradu.controller;


import com.jaycekon.dubbo.domain.User;
import com.jaycekon.dubbo.service.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("dubbo")
public class DubboController {

    @Autowired
    private CityDubboConsumerService service;


    @GetMapping("save")
    public User save(){
        return service.saveUser();
    }


}

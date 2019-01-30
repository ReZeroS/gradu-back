package com.jaycekon.dubbo.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jaycekon.dubbo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class CityDubboConsumerService {

    @Reference
    UserService userService;

    public User saveUser() {
        User user = new User();
        user.setUsername("jaycekon")
                .setPassword("jaycekong824");
        return userService.saveUser(user);
    }




}

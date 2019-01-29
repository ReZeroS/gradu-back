package com.rezero.gradu.service.impl;

import com.rezero.gradu.entity.User;
import com.rezero.gradu.entity.UserSec;
import com.rezero.gradu.mapper.mysql.UserMapper;
import com.rezero.gradu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public UserSec findUserByUserame(String username) {
        return userMapper.findByUserName();
    }
}

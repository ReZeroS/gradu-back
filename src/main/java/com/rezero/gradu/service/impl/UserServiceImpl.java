package com.rezero.gradu.service.impl;

import com.rezero.gradu.mapper.oracle.UserMapper;
import com.rezero.gradu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Map<String, Object>> getAllUsersFromOralce() {
        return userMapper.findAllUsers();
    }
}

package com.rezero.gradu.service;

import com.rezero.gradu.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
//    public List<Map<String, Object>> getAllUsersFromOralce();

    List<User> findAllUsers();
}


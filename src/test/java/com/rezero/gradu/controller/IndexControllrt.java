package com.rezero.gradu.controller;


import com.rezero.gradu.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
public class IndexControllrt {
//
////    @ApiIgnore
//    @GetMapping("hello")
//    public @ResponseBody
//    String hello() {
//        return "hello";
//    }
//
////    @ApiOperation(value = "获取用户信息", notes = "根据用户id获取用户信息")
////    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
//    @GetMapping("/{id}")
//    public @ResponseBody
//    User getUserById(@PathVariable(value = "id") Long id) {
//        User user = new User();
//        user.setUserName("root");
//        return user;
//    }
//
////    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
//    @GetMapping("/list")
//    public @ResponseBody
//    List<User> getUserList() {
//        List<User> list = new ArrayList<>();
//        User user1 = new User();
//        user1.setUserName("sdasd");
//        list.add(user1);
//        User user2 = new User();
//        user2.setUserName("name2");
//        return list;
//    }
//
////    @ApiOperation(value = "新增用户", notes = "根据用户实体创建用户")
////    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
//    @PostMapping("/add")
//    public @ResponseBody
//    Map<String, Object> addUser(@RequestBody User user) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("result", "success");
//        return map;
//    }
//
////    @ApiOperation(value = "删除用户", notes = "根据用户id删除用户")
////    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
//    @DeleteMapping("/{id}")
//    public @ResponseBody Map<String, Object> deleteUser(@PathVariable(value = "id") Long id) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("result", "success");
//        return map;
//    }
//
////    @ApiOperation(value = "更新用户", notes = "根据用户id更新用户")
////    @ApiImplicitParams({
////            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path"),
////            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User") })
//    @PutMapping("/{id}")
//    public @ResponseBody Map<String, Object> updateUser(@PathVariable(value = "id") Long id, @RequestBody User user) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("result", "success");
//        return map;
//    }
//


}

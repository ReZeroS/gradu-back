package com.rezero.gradu.mapper.mysql;


import com.rezero.gradu.entity.User;
import com.rezero.gradu.entity.UserSec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {



    @Select("select * from t_user")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName",  column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "createTime", column = "createtime"),
            @Result(property = "status", column = "status")
    })
    List<User> findAllUsers();

//    @Select("select * from t_user where user")
    User findByUserName(String userName);



    UserSec findByUserName();
}

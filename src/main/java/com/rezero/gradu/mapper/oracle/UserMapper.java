package com.rezero.gradu.mapper.oracle;

import com.rezero.gradu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserMapper {
    User findByUserName(@Param("username") String userName);

    Integer insert(User user);

    List<Map<String, Object>> findAllUsers();
}


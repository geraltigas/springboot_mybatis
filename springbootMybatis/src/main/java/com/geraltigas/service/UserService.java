package com.geraltigas.service;

import com.geraltigas.mapper.UserMapper;
import com.geraltigas.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    private final UserMapper userMapper;

    UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    List<User> getUsersById(String id){
        return this.userMapper.findByUserId(id);
    }

}

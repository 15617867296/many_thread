package com.maythread.demo.controller;

import com.maythread.demo.entity.UserEntity;
import com.maythread.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class UserContrller {
    @Autowired
    UserService userService;

    @GetMapping(value = "/get/{id}")
    public UserEntity userMapper(HttpServletRequest request, UserEntity userEntity){
        userEntity=userService.selectById(userEntity.getId());
        return userEntity;
    }
}

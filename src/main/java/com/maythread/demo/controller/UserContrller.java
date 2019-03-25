package com.maythread.demo.controller;

import com.maythread.demo.entity.UserEntity;
import com.maythread.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


@RestController
public class UserContrller {
    @Autowired
    UserService userService;

    @GetMapping(value = "/get/{id}")
    public UserEntity userMapper(HttpServletRequest request, UserEntity userEntity){
        userEntity=userService.selectById(userEntity.getId());
        return userEntity;
    }

    @Test
    public void CreateThread(){
        /**第一种线程方式*/
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始了");
            }
        }).start();*/
       /**第二种线程方式*/
        Callable<Boolean>userCall=new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("线程开始了！！！");
                return true;
            }
        };
        FutureTask<Boolean>userFutureTask=new FutureTask<Boolean>(userCall);
        new Thread(userFutureTask).start();

    }
}

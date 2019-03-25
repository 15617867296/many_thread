package com.maythread.demo.service.impl;

import com.maythread.demo.dao.UserDao;
import com.maythread.demo.entity.UserEntity;
import com.maythread.demo.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Log4j2
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int UserAdd(UserEntity userEntity) {
        return userDao.userAdd(userEntity);
    }

    @Override
    public int updateUser(UserEntity userEntity) {
        return userDao.updateUser(userEntity);
    }

    @Override
    public UserEntity selectById(String id) {
        return userDao.selectById(id);
    }

    @Override
    public int deleteById(String id) {
        return userDao.deleteById(id);
    }
}

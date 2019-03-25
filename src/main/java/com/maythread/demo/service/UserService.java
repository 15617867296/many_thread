package com.maythread.demo.service;

import com.maythread.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserService  {
    /**
     * add
     * */
    int UserAdd(UserEntity userEntity);
    /**
     * 修改
     * */
    int updateUser(UserEntity userEntity);
    /**
     * 查询
     * */
    UserEntity selectById(@Param("id") String id);
    /***
     *删除
     */
    int deleteById(@Param("id") String id);
}

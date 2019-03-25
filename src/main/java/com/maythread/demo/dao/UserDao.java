package com.maythread.demo.dao;

import com.maythread.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface UserDao {
    /**
     * add
     * */
    int userAdd(UserEntity userEntity);
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

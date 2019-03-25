package com.maythread.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserEntity implements Serializable {
    private String id;
    private String name;
    private String age;
    private String sex;
}

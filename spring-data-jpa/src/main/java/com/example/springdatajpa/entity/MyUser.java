package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 1.用@Entity注解标注本类是一个可持久化类
 * 2.用@Id注解指定主键
 * 3.用@GeneratedValue注解标注主键的策略，mysql为自增
 * 4.用@Data注解简化get/set
 */
@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String userAvatar;
}

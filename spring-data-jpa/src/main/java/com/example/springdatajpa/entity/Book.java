package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Book 实体类
 */
@Entity
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Long id;   //编号

    private String name;  //书名

    private String writer;  //作者

    private String introduction;  //简介

}

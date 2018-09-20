package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {

    @Resource
    private BookService bookService;

    @Test
    public void getBookList() {
        List<Book> bookList = bookService.findAll();
        bookList.forEach(book -> System.out.println(book));
    }

    @Test
    public void getBook() {
        System.out.println(bookService.findById(1L));
    }
}
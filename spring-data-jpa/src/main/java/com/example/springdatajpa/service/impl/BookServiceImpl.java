package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.BookRepository;
import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Book 业务层实现
 *
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book insertByBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book delete(Long id) {
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
        return book;
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }
}

package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleResopitory extends JpaRepository<Article, String> {
}

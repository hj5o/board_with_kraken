package com.example.by_myself.domain.repository;

import com.example.by_myself.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
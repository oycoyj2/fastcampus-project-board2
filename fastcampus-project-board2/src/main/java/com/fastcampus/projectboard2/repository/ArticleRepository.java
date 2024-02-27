package com.fastcampus.projectboard2.repository;

import com.fastcampus.projectboard2.domian.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
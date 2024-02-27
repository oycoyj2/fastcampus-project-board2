package com.fastcampus.projectboard2.repository;

import com.fastcampus.projectboard2.domian.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}

package com.fastcampus.projectboard2.domian;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;  //게시글 ID
    private String content;  //내용

    private LocalDateTime createdAt;  //생성자
    private String createdBy;  //생성일시
    private LocalDateTime modifiedAt;  //수정자
    private String modifiedBy;  //수정일시
}

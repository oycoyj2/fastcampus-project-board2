package com.fastcampus.projectboard2.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.fastcampus.projectboard2.domian.Article}
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
) {
    public static ArticleUpdateDto of(String title, String content, String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}

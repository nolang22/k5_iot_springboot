package com.example.k5_iot_springboot.dto.D_Comment.response;

import com.example.k5_iot_springboot.entity.D_Comment;

public record CommentResponseDto(
        Long id,
        Long postId,
        String content,
        String commenter
) {
    public static CommentResponseDto from(D_Comment comment) {
        if (comment == null) return null;
        return new CommentResponseDto(
                comment.getId(),
                comment.getPost() != null ? comment.getPost().getId() : null,
                comment.getContent(),
                comment.getCommenter()
        );
    }
}

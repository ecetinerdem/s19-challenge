package com.fsweb.s19_challenge.service;

import com.fsweb.s19_challenge.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllComments();
    Comment findCommentById(Long id);
    Comment saveComment(Comment comment);
    Comment updateComment(Long id, Comment comment);
    void deleteComment(Long id);
}

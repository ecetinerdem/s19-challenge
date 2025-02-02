package com.fsweb.s19_challenge.service;

import com.fsweb.s19_challenge.entity.Comment;
import com.fsweb.s19_challenge.exceptions.CommentException;
import com.fsweb.s19_challenge.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findCommentById(Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new CommentException("Comment does not exist with given id " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        Comment foundComment = findCommentById(id);
        if (foundComment.getUser().equals(comment.getUser())) {
            foundComment.setContent(comment.getContent());
            foundComment.setIsLiked(comment.getIsLiked());
            foundComment.setTweet(comment.getTweet());
        }
        return foundComment ;
    }

    @Override
    public void deleteComment(Long id) {
        Comment foundComment = findCommentById(id);
        commentRepository.delete(foundComment);
    }
}

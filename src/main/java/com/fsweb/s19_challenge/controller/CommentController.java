package com.fsweb.s19_challenge.controller;

import com.fsweb.s19_challenge.entity.Comment;
import com.fsweb.s19_challenge.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/comment")
@RestController
public class CommentController {
    private final CommentService commentService;

    @GetMapping
    public List<Comment> findAllComments() {
        return commentService.findAllComments();
    }

    @GetMapping("/{id}")
    public Comment findCommentById(@PathVariable("id") Long id) {
        return commentService.findCommentById(id);
    }

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment) {
        return  commentService.saveComment(comment);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable("id") Long id, @RequestBody Comment comment) {
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment (@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }
}

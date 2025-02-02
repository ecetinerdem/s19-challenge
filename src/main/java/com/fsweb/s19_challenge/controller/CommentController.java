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

}

package com.fsweb.s19_challenge.repository;

import com.fsweb.s19_challenge.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

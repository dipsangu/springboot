package com.example.jpa.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Comment;

/**
 *
 */
@RestController
public class CommentController {

    @GetMapping("/articles/{articleId}/comments")
    public Page<Comment> getAllCommentsByArticleId() {
        return null;
    }

    @PostMapping("/articles/{articleId}/comments")
    public Comment createComment() {
    	return null;
    }

    @PutMapping("/articles/{articleId}/comments/{commentId}")
    public Comment updateComment() {
    	return null;
    }

    @DeleteMapping("/articles/{articleId}/comments/{commentId}")
    public ResponseEntity<?> deleteComment() {return null;}
}

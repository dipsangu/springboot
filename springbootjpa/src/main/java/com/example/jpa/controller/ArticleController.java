package com.example.jpa.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Article;

@RestController
public class ArticleController {

    @GetMapping("/articles")
    public Page<Article> getAllArticles(Pageable pageable) {
    	return null;
    }

    @PostMapping("/articles")
    public Article createArticle() {
    	return null;
    }

    @PutMapping("/articles/{articleId}")
    public Article updateArticle() {
        return null;
    }
    @DeleteMapping("/articles/{articleId}")
    public ResponseEntity<?> deleteArticle(@PathVariable Long articleId) {
    	return null;
    }

}

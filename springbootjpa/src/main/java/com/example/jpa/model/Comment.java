package com.example.jpa.model;

public class Comment extends AuditModel {
    private Long id;
    private String text;
    private Article article;

}

package com.example.jpa.model;

public class Comment extends AuditModel {
    private Long id;
    private String text;
    private Article article;
  // ToDo setter getter or use lombok dependency need to add for lombok
}

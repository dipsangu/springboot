package com.example.jpa.model;

public class Article extends AuditModel {

    private Long id;
    // handle should email & same has to be validated.
    private String handle;
    private String title;
    private String description;
    private String content;

    // ToDo setter getter or use lombok dependency need to add for lombok
 
}

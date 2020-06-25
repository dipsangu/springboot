package com.example.jpa.model;

import java.io.Serializable;
import java.util.Date;


public abstract class AuditModel implements Serializable {

    private Date createdAt;
    private Date updatedAt;

    // ToDo setter getter or use lombok dependency need to add for lombok
}

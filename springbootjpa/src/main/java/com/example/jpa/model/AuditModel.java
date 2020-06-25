package com.example.jpa.model;

import java.io.Serializable;
import java.util.Date;


public abstract class AuditModel implements Serializable {
    private Date createdAt;
    private Date updatedAt;
}

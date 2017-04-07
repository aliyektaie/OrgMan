package com.orgman.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yektaie on 4/7/17.
 */
@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "user_id")
    private int userId;

    @Column(unique = true, nullable = false, length = 128, name = "identifier")
    private String identifier;

    @Column(nullable = false, name = "creation_date")
    private Date creationDate;

    @Column(nullable = false, name = "expiration_date")
    private Date expirationDate;

    public Session() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}

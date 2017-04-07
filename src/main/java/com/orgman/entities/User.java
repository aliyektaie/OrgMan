package com.orgman.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yektaie on 4/7/17.
 */
@Entity
@Table(name = "users")
public class User {
    public final static int ROLE_ADMIN = 1;
    public final static int ROLE_MANAGER = 2;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 128, name = "first_name")
    private String firstName;

    @Column(nullable = false, length = 128, name = "last_name")
    private String lastName;

    @Column(unique = true, nullable = false, length = 128, name = "user_name")
    private String userName;

    @Column(nullable = false, length = 128, name = "password")
    private String password;

    @Column(unique = true, nullable = false, length = 128, name = "email")
    private String email;

    @Column(nullable = false, name = "is_active")
    private boolean isActive;

    @Column(unique = true, nullable = false, length = 128, name = "activation_identifier")
    private String activationIdentifier;

    @Column(nullable = false, name = "role")
    private int role;

    @Column(nullable = false, name = "registration_date")
    private Date registrationDate;

    @Column(unique = true, nullable = false, length = 128, name = "identifier")
    private String identifier;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getActivationIdentifier() {
        return activationIdentifier;
    }

    public void setActivationIdentifier(String activationIdentifier) {
        this.activationIdentifier = activationIdentifier;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

package com.tap.user;

public class User {
    private int uid;
    private String username;
    private String email;
    private String password;
    private String mobile; // Changed from long to String

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() { // Updated return type
        return mobile;
    }

    public void setMobile(String mobile) { // Updated parameter type
        this.mobile = mobile;
    }

    // Constructor with all fields
    public User(int uid, String username, String email, String password, String mobile) {
        super();
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    // Default constructor
    public User() {
        super();
    }

    // Constructor without uid
    public User(String username, String email, String password, String mobile) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    // Constructor with uid and email
    public User(int uid, String email) {
        this.uid = uid;
        this.email = email;
    }

    @Override
    public String toString() {
        return uid + "  " + username + "  " + email + "  " + mobile; // Updated toString method
    }
}
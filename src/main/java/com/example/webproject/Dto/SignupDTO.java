package com.example.webproject.Dto;

import com.example.webproject.Dao.UserDAO;

public class SignupDTO {
    private String email;
    private String password;
    private String userName;

    public SignupDTO() {

    }

    public UserDAO toEntity() {
        return new UserDAO(email, password, userName);
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

    public String getUserName() {
        return userName;
    }

    public void setNickname(String userName) {
        this.userName = userName;
    }
}

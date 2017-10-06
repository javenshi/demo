package com.syj.demo.entity;

/**
 * 用户表
 */
public class User {
    private int userId;
    private String userName;
    private String pwd;
    private String email;
    private int integral;
    private int userStatus;
    public User(String userName, String passWord, String email) {
        this.userName = userName;
        this.pwd = passWord;
        this.email = email;
        this.integral = 1;
        this.userStatus = 1;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", integral=" + integral +
                ", userStatus=" + userStatus +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return pwd;
    }

    public void setPassWord(String passWord) {
        this.pwd = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }




}

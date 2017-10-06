package com.syj.demo.entity;

import java.util.Date;

/**
 * 博客表
 */
public class Blogs {
    private int blogsId;
    private String blogsName;
    private String blogsContext;
    private int blogsStatus;//是否原创
    private int status;//审稿状态
    private int blogsClick;
    private Date blogsDate;
    private int blogsClassifyId;
    private int userId;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public int getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(int blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsName() {
        return blogsName;
    }

    public void setBlogsName(String blogsName) {
        this.blogsName = blogsName;
    }

    public String getBlogsContext() {
        return blogsContext;
    }

    public void setBlogsContext(String blogsContext) {
        this.blogsContext = blogsContext;
    }

    public int getBlogsStatus() {
        return blogsStatus;
    }

    public void setBlogsStatus(int blogsStatus) {
        this.blogsStatus = blogsStatus;
    }

    public int getBlogsClick() {
        return blogsClick;
    }

    public void setBlogsClick(int blogsClick) {
        this.blogsClick = blogsClick;
    }

    public Date getBlogsDate() {
        return blogsDate;
    }

    public void setBlogsDate(Date blogsDate) {
        this.blogsDate = blogsDate;
    }

    public int getBlogsClassifyId() {
        return blogsClassifyId;
    }

    public void setBlogsClassifyId(int blogsClassifyId) {
        this.blogsClassifyId = blogsClassifyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "blogs{" +
                "blogsId=" + blogsId +
                ", blogsName='" + blogsName + '\'' +
                ", blogsContext='" + blogsContext + '\'' +
                ", blogsStatus=" + blogsStatus +
                ", blogsClick=" + blogsClick +
                ", blogsDate=" + blogsDate +
                ", blogsClassifyId=" + blogsClassifyId +
                ", userId=" + userId +
                '}';
    }
}

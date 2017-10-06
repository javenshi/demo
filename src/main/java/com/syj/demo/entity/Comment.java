package com.syj.demo.entity;

import java.util.Date;

/**
 * 评论表
 */
public class Comment {
    private int commentId;
    private String commentName;
    private int userId;
    private Date commentDate;
    private int blogsid;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public int getBlogsid() {
        return blogsid;
    }

    public void setBlogsid(int blogsid) {
        this.blogsid = blogsid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commentName='" + commentName + '\'' +
                ", userId=" + userId +
                ", commentDate=" + commentDate +
                ", blogsid=" + blogsid +
                '}';
    }
}

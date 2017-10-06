package com.syj.demo.entity;

/**
 * 博客分类表
 */
public class BlogsClassify {
    private int blogsClassifyId;
    private String blogsClassifyName;
    private int blogsClassifyClick;

    public int getBlogsClassifyId() {
        return blogsClassifyId;
    }

    public void setBlogsClassifyId(int blogsClassifyId) {
        this.blogsClassifyId = blogsClassifyId;
    }

    public String getBlogsClassifyName() {
        return blogsClassifyName;
    }

    public void setBlogsClassifyName(String blogsClassifyName) {
        this.blogsClassifyName = blogsClassifyName;
    }

    public int getBlogsClassifyClick() {
        return blogsClassifyClick;
    }

    public void setBlogsClassifyClick(int blogsClassifyClick) {
        this.blogsClassifyClick = blogsClassifyClick;
    }

    @Override
    public String toString() {

        return "BlogsClassify{" +
                "blogsClassifyId=" + blogsClassifyId +
                ", blogsClassifyName='" + blogsClassifyName + '\'' +
                ", blogsClassifyClick=" + blogsClassifyClick +
                '}';
    }
}

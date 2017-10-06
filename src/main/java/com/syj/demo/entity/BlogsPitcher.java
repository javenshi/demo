package com.syj.demo.entity;

import java.util.Date;

/**
 * 博客图片
 */
public class BlogsPitcher {
    private int pitcherId;
    private String pitcherUrl;
    private int blogsId;

    public int getPitcherId() {
        return pitcherId;
    }

    public void setPitcherId(int pitcherId) {
        this.pitcherId = pitcherId;
    }

    public String getPitcherUrl() {
        return pitcherUrl;
    }

    public void setPitcherUrl(String pitcherUrl) {
        this.pitcherUrl = pitcherUrl;
    }

    public int getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(int blogsId) {
        this.blogsId = blogsId;
    }

    @Override

    public String toString() {
        return "BlogsPitcher{" +
                "pitcherId=" + pitcherId +
                ", pitcherUrl='" + pitcherUrl + '\'' +
                ", blogsId=" + blogsId +
                '}';
    }
}

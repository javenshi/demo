package com.syj.demo.entity;

import java.util.Date;

public class Announcement {
    private int announcementId;
    private String announcementTitle;
    private String announcementContext;
    private Date announcementDate;

    public int getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(int announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getAnnouncementContext() {
        return announcementContext;
    }

    public void setAnnouncementContext(String announcementContext) {
        this.announcementContext = announcementContext;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "announcementId=" + announcementId +
                ", announcementTitle='" + announcementTitle + '\'' +
                ", announcementContext='" + announcementContext + '\'' +
                '}';
    }
}

package com.syj.demo.entity;

/**
 * 资源实体
 */
public class Resource {
    private int resouceId;
    private String resouceName;
    private String resouceUrl;
    private int resouceClick;
    private int userid;

    public int getResouceId() {
        return resouceId;
    }

    public void setResouceId(int resouceId) {
        this.resouceId = resouceId;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resouceId=" + resouceId +
                ", resouceName='" + resouceName + '\'' +
                ", resouceUrl='" + resouceUrl + '\'' +
                ", resouceClick=" + resouceClick +
                ", userid=" + userid +
                ", resouceClassifyId=" + resouceClassifyId +
                '}';
    }

    public String getResouceName() {
        return resouceName;
    }

    public void setResouceName(String resouceName) {
        this.resouceName = resouceName;
    }

    public String getResouceUrl() {
        return resouceUrl;
    }

    public void setResouceUrl(String resouceUrl) {
        this.resouceUrl = resouceUrl;
    }

    public int getResouceClick() {
        return resouceClick;
    }

    public void setResouceClick(int resouceClick) {
        this.resouceClick = resouceClick;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getResouceClassifyId() {
        return resouceClassifyId;
    }

    public void setResouceClassifyId(int resouceClassifyId) {
        this.resouceClassifyId = resouceClassifyId;
    }

    private int resouceClassifyId;


}

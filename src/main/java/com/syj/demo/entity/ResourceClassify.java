package com.syj.demo.entity;

/**
 * 资源分类实体
 */
public class ResourceClassify {
    private int resourceClassifyId;
    private String resourceClassifyName;

    public int getResourceClassifyId() {
        return resourceClassifyId;
    }

    public void setResourceClassifyId(int resourceClassifyId) {
        this.resourceClassifyId = resourceClassifyId;
    }

    public String getResourceClassifyName() {
        return resourceClassifyName;
    }

    public void setResourceClassifyName(String resourceClassifyName) {
        this.resourceClassifyName = resourceClassifyName;
    }

    @Override
    public String toString() {
        return "ResourceClassify{" +
                "resourceClassifyId=" + resourceClassifyId +
                ", resourceClassifyName='" + resourceClassifyName + '\'' +
                '}';
    }


}

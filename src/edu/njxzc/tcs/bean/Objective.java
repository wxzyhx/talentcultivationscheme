package edu.njxzc.tcs.bean;

import java.util.Date;

public class Objective {
    private Integer objectiveid;//自增长

    private Integer cultivationschemeId;//关联培养方案id

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    private String objectivecontent;//培养目标内容

    public Integer getObjectiveid() {
        return objectiveid;
    }

    public void setObjectiveid(Integer objectiveid) {
        this.objectiveid = objectiveid;
    }

    public Integer getCultivationschemeId() {
        return cultivationschemeId;
    }

    public void setCultivationschemeId(Integer cultivationschemeId) {
        this.cultivationschemeId = cultivationschemeId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreatedUserSn() {
        return createdUserSn;
    }

    public void setCreatedUserSn(String createdUserSn) {
        this.createdUserSn = createdUserSn == null ? null : createdUserSn.trim();
    }

    public String getModifiedUserSn() {
        return modifiedUserSn;
    }

    public void setModifiedUserSn(String modifiedUserSn) {
        this.modifiedUserSn = modifiedUserSn == null ? null : modifiedUserSn.trim();
    }

    public String getObjectivecontent() {
        return objectivecontent;
    }

    public void setObjectivecontent(String objectivecontent) {
        this.objectivecontent = objectivecontent == null ? null : objectivecontent.trim();
    }
}
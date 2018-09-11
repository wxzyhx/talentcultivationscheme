package edu.njxzc.tcs.bean;

import java.util.Date;

public class SpecialityClassification {
    private Integer speciaclassid;

    private String speciaclassname;

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getSpeciaclassid() {
        return speciaclassid;
    }

    public void setSpeciaclassid(Integer speciaclassid) {
        this.speciaclassid = speciaclassid;
    }

    public String getSpeciaclassname() {
        return speciaclassname;
    }

    public void setSpeciaclassname(String speciaclassname) {
        this.speciaclassname = speciaclassname == null ? null : speciaclassname.trim();
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
}
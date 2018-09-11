package edu.njxzc.tcs.bean;

import java.util.Date;

public class Requirementitem {
    private Integer requirementitemid;//自增长

    private String requirementitemsn;//毕业要求分解项序号

    private Integer requirementId;//关联毕业要求id

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    private String requirementitemdesc;//毕业要求分解项描述

    public Integer getRequirementitemid() {
        return requirementitemid;
    }

    public void setRequirementitemid(Integer requirementitemid) {
        this.requirementitemid = requirementitemid;
    }

    public String getRequirementitemsn() {
        return requirementitemsn;
    }

    public void setRequirementitemsn(String requirementitemsn) {
        this.requirementitemsn = requirementitemsn == null ? null : requirementitemsn.trim();
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
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

    public String getRequirementitemdesc() {
        return requirementitemdesc;
    }

    public void setRequirementitemdesc(String requirementitemdesc) {
        this.requirementitemdesc = requirementitemdesc == null ? null : requirementitemdesc.trim();
    }
}
package edu.njxzc.tcs.bean;

import java.util.Date;

public class RequirementObjectiveItem {
    private Integer requireObjid;//自增长

    private Integer requirementid;//关联毕业要求id主键

    private Integer objectiveitemid;//关联培养目标分解项id主键

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getRequireObjid() {
        return requireObjid;
    }

    public void setRequireObjid(Integer requireObjid) {
        this.requireObjid = requireObjid;
    }

    public Integer getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(Integer requirementid) {
        this.requirementid = requirementid;
    }

    public Integer getObjectiveitemid() {
        return objectiveitemid;
    }

    public void setObjectiveitemid(Integer objectiveitemid) {
        this.objectiveitemid = objectiveitemid;
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
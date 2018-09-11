package edu.njxzc.tcs.bean;

import java.util.Date;

public class ObjectiveItem {
    private Integer objectiveitemid;//自增长

    private String objectiveitemname;//培养目标分解项序号

    private Integer objectiveId;//关联培养目标id

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    private String objectiveitemdesc;//培养目标分解项内容

    public Integer getObjectiveitemid() {
        return objectiveitemid;
    }

    public void setObjectiveitemid(Integer objectiveitemid) {
        this.objectiveitemid = objectiveitemid;
    }

    public String getObjectiveitemname() {
        return objectiveitemname;
    }

    public void setObjectiveitemname(String objectiveitemname) {
        this.objectiveitemname = objectiveitemname == null ? null : objectiveitemname.trim();
    }

    public Integer getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(Integer objectiveId) {
        this.objectiveId = objectiveId;
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

    public String getObjectiveitemdesc() {
        return objectiveitemdesc;
    }

    public void setObjectiveitemdesc(String objectiveitemdesc) {
        this.objectiveitemdesc = objectiveitemdesc == null ? null : objectiveitemdesc.trim();
    }
}
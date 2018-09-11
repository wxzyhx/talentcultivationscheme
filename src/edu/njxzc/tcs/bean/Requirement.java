package edu.njxzc.tcs.bean;

import java.util.Date;

public class Requirement {
    private Integer requirementid;//自增长id

    private String requirementname;//毕业要求名称

    private Integer cultivationschemeId;//关联培养目标id

    private String objectiveitems;//关联目标项id字符串

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    private String requirementdesc;//毕业要求内容

    public Integer getRequirementid() {
        return requirementid;
    }

    public void setRequirementid(Integer requirementid) {
        this.requirementid = requirementid;
    }

    public String getRequirementname() {
        return requirementname;
    }

    public void setRequirementname(String requirementname) {
        this.requirementname = requirementname == null ? null : requirementname.trim();
    }

    public Integer getCultivationschemeId() {
        return cultivationschemeId;
    }

    public void setCultivationschemeId(Integer cultivationschemeId) {
        this.cultivationschemeId = cultivationschemeId;
    }

    public String getObjectiveitems() {
        return objectiveitems;
    }

    public void setObjectiveitems(String objectiveitems) {
        this.objectiveitems = objectiveitems == null ? null : objectiveitems.trim();
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

    public String getRequirementdesc() {
        return requirementdesc;
    }

    public void setRequirementdesc(String requirementdesc) {
        this.requirementdesc = requirementdesc == null ? null : requirementdesc.trim();
    }
}
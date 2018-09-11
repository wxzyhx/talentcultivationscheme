package edu.njxzc.tcs.bean;

import java.util.Date;

public class Speciality {
    private Integer specialityid; //自增长id

    private String specialitycode;//专业编码

    private String specialityname;//专业名称

    private Integer speciaclassId;//关联专业类别id

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getSpecialityid() {
        return specialityid;
    }

    public void setSpecialityid(Integer specialityid) {
        this.specialityid = specialityid;
    }

    public String getSpecialitycode() {
        return specialitycode;
    }

    public void setSpecialitycode(String specialitycode) {
        this.specialitycode = specialitycode == null ? null : specialitycode.trim();
    }

    public String getSpecialityname() {
        return specialityname;
    }

    public void setSpecialityname(String specialityname) {
        this.specialityname = specialityname == null ? null : specialityname.trim();
    }

    public Integer getSpeciaclassId() {
        return speciaclassId;
    }

    public void setSpeciaclassId(Integer speciaclassId) {
        this.speciaclassId = speciaclassId;
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
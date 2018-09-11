package edu.njxzc.tcs.bean;

import java.util.Date;

public class Degree {
    private Integer degreeid;//自增长

    private String degreecode;//学位编码

    private String degreename;//学位名称

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(Integer degreeid) {
        this.degreeid = degreeid;
    }

    public String getDegreecode() {
        return degreecode;
    }

    public void setDegreecode(String degreecode) {
        this.degreecode = degreecode == null ? null : degreecode.trim();
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename == null ? null : degreename.trim();
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
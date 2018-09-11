package edu.njxzc.tcs.bean;

import java.util.Date;

public class genenalCourseCultivationScheme {
    private Integer culGenenalcourseid;//自增长id

    private Integer genenalcourseId;//关联通识课主键

    private Integer cultivationschemeId;//关联培养方案主键

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getCulGenenalcourseid() {
        return culGenenalcourseid;
    }

    public void setCulGenenalcourseid(Integer culGenenalcourseid) {
        this.culGenenalcourseid = culGenenalcourseid;
    }

    public Integer getGenenalcourseId() {
        return genenalcourseId;
    }

    public void setGenenalcourseId(Integer genenalcourseId) {
        this.genenalcourseId = genenalcourseId;
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
}
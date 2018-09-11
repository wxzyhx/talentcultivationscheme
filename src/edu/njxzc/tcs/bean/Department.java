package edu.njxzc.tcs.bean;

import java.util.Date;

public class Department {
    private Integer departmentid;//自增长

    private String departmentname;//部门名称

    private String schoolname;//所在学校名称

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
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
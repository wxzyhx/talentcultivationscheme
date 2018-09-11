package edu.njxzc.tcs.bean;

import java.util.Date;

public class SchoolSystemDegree {
    private Integer schoolsystemdegreeid;//自增长

    private Integer schoolsystem;//学制

    private Integer upperyears;//学习年限上限

    private Integer loweryears;//学习年限下限

    private Integer degreeId;//关联学位id

    private Integer cultivationschemeId;//关联培养方案id

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getSchoolsystemdegreeid() {
        return schoolsystemdegreeid;
    }

    public void setSchoolsystemdegreeid(Integer schoolsystemdegreeid) {
        this.schoolsystemdegreeid = schoolsystemdegreeid;
    }

    public Integer getSchoolsystem() {
        return schoolsystem;
    }

    public void setSchoolsystem(Integer schoolsystem) {
        this.schoolsystem = schoolsystem;
    }

    public Integer getUpperyears() {
        return upperyears;
    }

    public void setUpperyears(Integer upperyears) {
        this.upperyears = upperyears;
    }

    public Integer getLoweryears() {
        return loweryears;
    }

    public void setLoweryears(Integer loweryears) {
        this.loweryears = loweryears;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
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
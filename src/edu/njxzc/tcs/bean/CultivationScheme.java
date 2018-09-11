package edu.njxzc.tcs.bean;

import java.util.Date;

public class CultivationScheme {
    private Integer cultivationid;//自增长

    private String cultivationname;

    private Date culcreatetime;

    private Integer specialityclassificationId;//关联专业类别id

    private Integer specialityId;//关联专业id

    private Integer departmentId;//关联院系id

    private String departmenthead;//院系负责人

    private String specialityprincipal;//专业负责人

    private String reviewer;//复核员

    private String president;//校长

    private Integer iscompleted;//是否已提交

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getCultivationid() {
        return cultivationid;
    }

    public void setCultivationid(Integer cultivationid) {
        this.cultivationid = cultivationid;
    }

    public String getCultivationname() {
        return cultivationname;
    }

    public void setCultivationname(String cultivationname) {
        this.cultivationname = cultivationname == null ? null : cultivationname.trim();
    }

    public Date getCulcreatetime() {
        return culcreatetime;
    }

    public void setCulcreatetime(Date culcreatetime) {
        this.culcreatetime = culcreatetime;
    }

    public Integer getSpecialityclassificationId() {
        return specialityclassificationId;
    }

    public void setSpecialityclassificationId(Integer specialityclassificationId) {
        this.specialityclassificationId = specialityclassificationId;
    }

    public Integer getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Integer specialityId) {
        this.specialityId = specialityId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmenthead() {
        return departmenthead;
    }

    public void setDepartmenthead(String departmenthead) {
        this.departmenthead = departmenthead == null ? null : departmenthead.trim();
    }

    public String getSpecialityprincipal() {
        return specialityprincipal;
    }

    public void setSpecialityprincipal(String specialityprincipal) {
        this.specialityprincipal = specialityprincipal == null ? null : specialityprincipal.trim();
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president == null ? null : president.trim();
    }

    public Integer getIscompleted() {
        return iscompleted;
    }

    public void setIscompleted(Integer iscompleted) {
        this.iscompleted = iscompleted;
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
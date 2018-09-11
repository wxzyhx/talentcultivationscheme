package edu.njxzc.tcs.bean;

import java.util.Date;

public class CourseClassification {
    private Integer courseclassificationid;//主键

    private String courseclassificationname;//课程类别名称

    private String courseclassifcationdesc;//课程类型描述

    private Float coursecreditrule;//课程类型学分最低要求

    private Integer speciaclassId;//关联专业类别id

    private Integer cultivationschemeId;//关联培养方案id

    private Integer orderby;//排序

    private Integer coursetag;//1-基本课程标准，2-工程类课程标准，3-师范类课程标准

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getCourseclassificationid() {
        return courseclassificationid;
    }

    public void setCourseclassificationid(Integer courseclassificationid) {
        this.courseclassificationid = courseclassificationid;
    }

    public String getCourseclassificationname() {
        return courseclassificationname;
    }

    public void setCourseclassificationname(String courseclassificationname) {
        this.courseclassificationname = courseclassificationname == null ? null : courseclassificationname.trim();
    }

    public String getCourseclassifcationdesc() {
        return courseclassifcationdesc;
    }

    public void setCourseclassifcationdesc(String courseclassifcationdesc) {
        this.courseclassifcationdesc = courseclassifcationdesc == null ? null : courseclassifcationdesc.trim();
    }

    public Float getCoursecreditrule() {
        return coursecreditrule;
    }

    public void setCoursecreditrule(Float coursecreditrule) {
        this.coursecreditrule = coursecreditrule;
    }

    public Integer getSpeciaclassId() {
        return speciaclassId;
    }

    public void setSpeciaclassId(Integer speciaclassId) {
        this.speciaclassId = speciaclassId;
    }

    public Integer getCultivationschemeId() {
        return cultivationschemeId;
    }

    public void setCultivationschemeId(Integer cultivationschemeId) {
        this.cultivationschemeId = cultivationschemeId;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    public Integer getCoursetag() {
        return coursetag;
    }

    public void setCoursetag(Integer coursetag) {
        this.coursetag = coursetag;
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
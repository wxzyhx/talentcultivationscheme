package edu.njxzc.tcs.bean;

import java.util.Date;

public class GenenalCourse {//与Course类基本一致
    private Integer coursid;

    private String coursecode;

    private String coursename;

    private String courseenglishname;

    private Integer speciaclassId;//关联专业类别id

    private Integer courseclassificationId;

    private Integer childcourseclassificationId;

    private Integer engineercourseclassificationId;

    private Integer teachingcourseclassificationId;

    private Integer coursetype;

    private String courseclassifcationdesc;

    private Integer ismajor;

    private Integer isbilingual;

    private Integer isenglish;

    private Integer isindustry;

    private Integer isinternational;

    private Float totalcredit;

    private Float theorycredit;

    private Float practicalcredit;

    private Integer term;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private String createdUserSn;

    private String modifiedUserSn;

    public Integer getCoursid() {
        return coursid;
    }

    public void setCoursid(Integer coursid) {
        this.coursid = coursid;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode == null ? null : coursecode.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseenglishname() {
        return courseenglishname;
    }

    public void setCourseenglishname(String courseenglishname) {
        this.courseenglishname = courseenglishname == null ? null : courseenglishname.trim();
    }

    public Integer getSpeciaclassId() {
        return speciaclassId;
    }

    public void setSpeciaclassId(Integer speciaclassId) {
        this.speciaclassId = speciaclassId;
    }

    public Integer getCourseclassificationId() {
        return courseclassificationId;
    }

    public void setCourseclassificationId(Integer courseclassificationId) {
        this.courseclassificationId = courseclassificationId;
    }

    public Integer getChildcourseclassificationId() {
        return childcourseclassificationId;
    }

    public void setChildcourseclassificationId(Integer childcourseclassificationId) {
        this.childcourseclassificationId = childcourseclassificationId;
    }

    public Integer getEngineercourseclassificationId() {
        return engineercourseclassificationId;
    }

    public void setEngineercourseclassificationId(Integer engineercourseclassificationId) {
        this.engineercourseclassificationId = engineercourseclassificationId;
    }

    public Integer getTeachingcourseclassificationId() {
        return teachingcourseclassificationId;
    }

    public void setTeachingcourseclassificationId(Integer teachingcourseclassificationId) {
        this.teachingcourseclassificationId = teachingcourseclassificationId;
    }

    public Integer getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(Integer coursetype) {
        this.coursetype = coursetype;
    }

    public String getCourseclassifcationdesc() {
        return courseclassifcationdesc;
    }

    public void setCourseclassifcationdesc(String courseclassifcationdesc) {
        this.courseclassifcationdesc = courseclassifcationdesc == null ? null : courseclassifcationdesc.trim();
    }

    public Integer getIsmajor() {
        return ismajor;
    }

    public void setIsmajor(Integer ismajor) {
        this.ismajor = ismajor;
    }

    public Integer getIsbilingual() {
        return isbilingual;
    }

    public void setIsbilingual(Integer isbilingual) {
        this.isbilingual = isbilingual;
    }

    public Integer getIsenglish() {
        return isenglish;
    }

    public void setIsenglish(Integer isenglish) {
        this.isenglish = isenglish;
    }

    public Integer getIsindustry() {
        return isindustry;
    }

    public void setIsindustry(Integer isindustry) {
        this.isindustry = isindustry;
    }

    public Integer getIsinternational() {
        return isinternational;
    }

    public void setIsinternational(Integer isinternational) {
        this.isinternational = isinternational;
    }

    public Float getTotalcredit() {
        return totalcredit;
    }

    public void setTotalcredit(Float totalcredit) {
        this.totalcredit = totalcredit;
    }

    public Float getTheorycredit() {
        return theorycredit;
    }

    public void setTheorycredit(Float theorycredit) {
        this.theorycredit = theorycredit;
    }

    public Float getPracticalcredit() {
        return practicalcredit;
    }

    public void setPracticalcredit(Float practicalcredit) {
        this.practicalcredit = practicalcredit;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
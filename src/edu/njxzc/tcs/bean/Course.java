package edu.njxzc.tcs.bean;

import java.util.Date;

public class Course {
	private Integer coursid;//自增长

	 private String coursecode;//课程编码
	  
	 private String coursename;//课程名称

	 private String courseenglishname;//课程英文名称

	 private Integer courseclassificationId;//关联课程类别id

	 private Integer engineercourseclassificationId;//关联工程课程类别id

	 private Integer teachingcourseclassificationId;//关联师范课程类别id

	 private Integer ismajor;//是否专业主干课程（0-不是、1-是）
	    
	 private Integer isbilingual;//是否双语课程（0-不是、1-是）

	 private Integer isenglish;//是否全英文授课课程（0-不是、1-是）

	 private Integer isindustry;//是否行业课程（0-不是、1-是）

	 private Integer isinternational;//是否国际课程（0-不是、1-是）

	 private Integer coursetype;//课程类型（必修0、选修1）

	 private Float totalcredit;//课程学分

	 private Float theorycredit;//理论课学分

	 private Float practicalcredit;//实践课学分

	 private Integer term;//开课学期

	 private Integer cultivationschemeId;//关联培养方案主键
  
  private Integer childcourseclassificationId;//关联子课程类别id

   private Date gmtCreate;

   private Date gmtModified;

   private String createdUserSn;

   private String modifiedUserSn;

   private String remark;//备注

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

    public Integer getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(Integer coursetype) {
        this.coursetype = coursetype;
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
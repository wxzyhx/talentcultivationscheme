package edu.njxzc.tcs.bean;

public class ChildCourseClassification {
    private Integer childcourseclassificationid;//自增长主键

    private String childcourseclassificationname;//子课程类别名称

    private String childcourseclassifcationdesc;//子课程类别描述

    private String courseclassifcationdesc;//父课程类别描述

    public Integer getChildcourseclassificationid() {
        return childcourseclassificationid;
    }

    public void setChildcourseclassificationid(Integer childcourseclassificationid) {
        this.childcourseclassificationid = childcourseclassificationid;
    }

    public String getChildcourseclassificationname() {
        return childcourseclassificationname;
    }

    public void setChildcourseclassificationname(String childcourseclassificationname) {
        this.childcourseclassificationname = childcourseclassificationname == null ? null : childcourseclassificationname.trim();
    }

    public String getChildcourseclassifcationdesc() {
        return childcourseclassifcationdesc;
    }

    public void setChildcourseclassifcationdesc(String childcourseclassifcationdesc) {
        this.childcourseclassifcationdesc = childcourseclassifcationdesc == null ? null : childcourseclassifcationdesc.trim();
    }

    public String getCourseclassifcationdesc() {
        return courseclassifcationdesc;
    }

    public void setCourseclassifcationdesc(String courseclassifcationdesc) {
        this.courseclassifcationdesc = courseclassifcationdesc == null ? null : courseclassifcationdesc.trim();
    }
}
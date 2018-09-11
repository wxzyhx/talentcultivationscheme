package edu.njxzc.tcs.bean;

import java.util.Date;

import edu.njxzc.tcs.core.BaseDomain;


/**
 * 2018-02-07添加继承
 * @author wxz
 *
 */
public class Teacher extends BaseDomain{
    private Integer id;

    private String teacher_ID;

    private Short teacher_status;

    private String password;

    private String teacher_name;

    private String teacher_class;

    private Date gmt_create;

    private Date gmt_modified;

    private Integer modified_user_ID;

    private Integer created_user_ID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacher_ID() {
        return teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        this.teacher_ID = teacher_ID == null ? null : teacher_ID.trim();
    }

    public Short getTeacher_status() {
        return teacher_status;
    }

    public void setTeacher_status(Short teacher_status) {
        this.teacher_status = teacher_status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name == null ? null : teacher_name.trim();
    }

    public String getTeacher_class() {
        return teacher_class;
    }

    public void setTeacher_class(String teacher_class) {
        this.teacher_class = teacher_class == null ? null : teacher_class.trim();
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getModified_user_ID() {
        return modified_user_ID;
    }

    public void setModified_user_ID(Integer modified_user_ID) {
        this.modified_user_ID = modified_user_ID;
    }

    public Integer getCreated_user_ID() {
        return created_user_ID;
    }

    public void setCreated_user_ID(Integer created_user_ID) {
        this.created_user_ID = created_user_ID;
    }
}
package edu.njxzc.tcs.bean;

import java.util.Date;

public class SysChildParameter {
    private Integer childParmId;

    private String childParmName;

    private String childParmDisplay;

    private String childParmDescription;

    private Short parParmId;

    private String childParmOrder;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedUserId;

    private Integer createdUserId;

    public Integer getChildParmId() {
        return childParmId;
    }

    public void setChildParmId(Integer childParmId) {
        this.childParmId = childParmId;
    }

    public String getChildParmName() {
        return childParmName;
    }

    public void setChildParmName(String childParmName) {
        this.childParmName = childParmName == null ? null : childParmName.trim();
    }

    public String getChildParmDisplay() {
        return childParmDisplay;
    }

    public void setChildParmDisplay(String childParmDisplay) {
        this.childParmDisplay = childParmDisplay == null ? null : childParmDisplay.trim();
    }

    public String getChildParmDescription() {
        return childParmDescription;
    }

    public void setChildParmDescription(String childParmDescription) {
        this.childParmDescription = childParmDescription == null ? null : childParmDescription.trim();
    }

    public Short getParParmId() {
        return parParmId;
    }

    public void setParParmId(Short parParmId) {
        this.parParmId = parParmId;
    }

    public String getChildParmOrder() {
        return childParmOrder;
    }

    public void setChildParmOrder(String childParmOrder) {
        this.childParmOrder = childParmOrder == null ? null : childParmOrder.trim();
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

    public Integer getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }
}
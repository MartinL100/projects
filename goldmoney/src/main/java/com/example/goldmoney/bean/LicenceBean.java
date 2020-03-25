package com.example.goldmoney.bean;

public class LicenceBean  extends pageParentBean{
    /**编号*/
    private String licId;
    /**类型*/
    private String licType;
    /**类型描述*/
    private String licTypeDesc;
    /**全名*/
    private String licName;
    /**简称*/
    private String licNickName;
    /**审核部门*/
    private String licDepartment;
    /**有效期*/
    private String lifeCycle;
    /**审核时间*/
    private String checkTime;
    /**年检要求*/
    private String checkRequire;
    /**业务范围*/
    private String business;
    /**业务等级*/
    private String licLeve;
    /**业务等级描述*/
    private String licLeveDesc;
    /**业务说明*/
    private String licNote;
    /**最后修改时间*/
    private String lstModTime;

    public String getLicLeveDesc() {
        return licLeveDesc;
    }

    public void setLicLeveDesc(String licLeveDesc) {
        this.licLeveDesc = licLeveDesc;
    }

    public String getLicTypeDesc() {
        return licTypeDesc;
    }

    public void setLicTypeDesc(String licTypeDesc) {
        this.licTypeDesc = licTypeDesc;
    }

    public String getLstModTime() {
        return lstModTime;
    }

    public void setLstModTime(String lstModTime) {
        this.lstModTime = lstModTime;
    }

    public String getLicNote() {
        return licNote;
    }

    public void setLicNote(String licNote) {
        this.licNote = licNote;
    }

    public String getLicLeve() {
        return licLeve;
    }

    public void setLicLeve(String licLeve) {
        this.licLeve = licLeve;
    }

    public String getLicId() {
        return licId;
    }

    public void setLicId(String licId) {
        this.licId = licId;
    }

    public String getLicType() {
        return licType;
    }

    public void setLicType(String licType) {
        this.licType = licType;
    }

    public String getLicName() {
        return licName;
    }

    public void setLicName(String licName) {
        this.licName = licName;
    }

    public String getLicNickName() {
        return licNickName;
    }

    public void setLicNickName(String licNickName) {
        this.licNickName = licNickName;
    }

    public String getLicDepartment() {
        return licDepartment;
    }

    public void setLicDepartment(String licDepartment) {
        this.licDepartment = licDepartment;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckRequire() {
        return checkRequire;
    }

    public void setCheckRequire(String checkRequire) {
        this.checkRequire = checkRequire;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
}

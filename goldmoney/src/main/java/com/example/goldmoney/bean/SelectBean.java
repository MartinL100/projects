package com.example.goldmoney.bean;

public class SelectBean {
    /**下拉编号*/
    private String slId;
    /**下拉项中文*/
    private String slKey;
    /**下拉项代码值*/
    private String slValue;
    /**下拉名称*/
    private String slName;
    /**下拉名称代码*/
    private String slCd;
    /**父id*/
    private String slPid;
    /**最后修改时间*/
    private String lstModTime;

    public String getSlId() {
        return slId;
    }

    public void setSlId(String slId) {
        this.slId = slId;
    }

    public String getSlKey() {
        return slKey;
    }

    public void setSlKey(String slKey) {
        this.slKey = slKey;
    }

    public String getSlValue() {
        return slValue;
    }

    public void setSlValue(String slValue) {
        this.slValue = slValue;
    }

    public String getSlName() {
        return slName;
    }

    public void setSlName(String slName) {
        this.slName = slName;
    }

    public String getSlCd() {
        return slCd;
    }

    public void setSlCd(String slCd) {
        this.slCd = slCd;
    }

    public String getSlPid() {
        return slPid;
    }

    public void setSlPid(String slPid) {
        this.slPid = slPid;
    }

    public String getLstModTime() {
        return lstModTime;
    }

    public void setLstModTime(String lstModTime) {
        this.lstModTime = lstModTime;
    }
}

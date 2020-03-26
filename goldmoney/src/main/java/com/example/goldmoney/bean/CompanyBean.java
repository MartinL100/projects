package com.example.goldmoney.bean;

public class CompanyBean extends pageParentBean{
    /*公司编号**/
    private String comId;
    /**公司名称*/
    private String comName;
    /**公司行业类型*/
    private String comType;
    /**公司类型描述*/
    private String comTypeDesc;
    /**注册资本（万）*/
    private Integer comMoney;
    /**查询最小资本（万）*/
    private Integer startMoney;
    /**查询最大资本（万）*/
    private Integer endMoney;
    /**注册地区*/
    private String comArea;
    /**注册地区描述*/
    private String comAreaDesc;
    /**经营时间(年)*/
    private Integer comTime;
    /**查询开始时间(年)*/
    private Integer startTime;
    /**查询结束时间(年)*/
    private Integer endTime;
    /**纳税类型*/
    private String comPayType;
    /**纳税类型描述*/
    private String comPayTypeDesc;
    /**最后修改时间*/
    private String lstModTime;


    public Integer getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Integer startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(Integer endMoney) {
        this.endMoney = endMoney;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getComTypeDesc() {
        return comTypeDesc;
    }

    public void setComTypeDesc(String comTypeDesc) {
        this.comTypeDesc = comTypeDesc;
    }

    public Integer getComMoney() {
        return comMoney;
    }

    public void setComMoney(Integer comMoney) {
        this.comMoney = comMoney;
    }

    public String getComArea() {
        return comArea;
    }

    public void setComArea(String comArea) {
        this.comArea = comArea;
    }

    public String getComAreaDesc() {
        return comAreaDesc;
    }

    public void setComAreaDesc(String comAreaDesc) {
        this.comAreaDesc = comAreaDesc;
    }

    public Integer getComTime() {
        return comTime;
    }

    public void setComTime(Integer comTime) {
        this.comTime = comTime;
    }

    public String getComPayType() {
        return comPayType;
    }

    public void setComPayType(String comPayType) {
        this.comPayType = comPayType;
    }

    public String getComPayTypeDesc() {
        return comPayTypeDesc;
    }

    public void setComPayTypeDesc(String comPayTypeDesc) {
        this.comPayTypeDesc = comPayTypeDesc;
    }

    public String getLstModTime() {
        return lstModTime;
    }

    public void setLstModTime(String lstModTime) {
        this.lstModTime = lstModTime;
    }
}

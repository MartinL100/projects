package com.cbat.starsymbol.bean;

public class UserBean {
    private String userId;
    private String userName;
    private String pwd;
    private String lv;
    private String lstLogTime;
    private String tel;
    private String relName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getLstLogTime() {
        return lstLogTime;
    }

    public void setLstLogTime(String lstLogTime) {
        this.lstLogTime = lstLogTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }
}

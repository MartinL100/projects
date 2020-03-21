package com.example.goldmoney.service;

import com.example.goldmoney.bean.TxtBean;

import java.util.List;


public interface ITxtService {

    List<TxtBean> findTxt(TxtBean txtBean);
    void addTxt(TxtBean txtBean);
    List<TxtBean> findTxtAndSelect(TxtBean txtBean);
    int countCommon(TxtBean txtBean);
    void updateTxtLv(TxtBean txtBean);

}

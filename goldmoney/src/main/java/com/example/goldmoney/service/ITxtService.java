package com.example.goldmoney.service;

import com.example.goldmoney.bean.TxtBean;

import java.util.List;


public interface ITxtService {

    List<TxtBean> findTxtDao(TxtBean txtBean);
}

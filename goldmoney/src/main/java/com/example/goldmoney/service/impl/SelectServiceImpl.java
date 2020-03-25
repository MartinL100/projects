package com.example.goldmoney.service.impl;


import com.example.goldmoney.bean.SelectBean;
import com.example.goldmoney.dao.ISelectDao;
import com.example.goldmoney.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectServiceImpl implements ISelectService {
    @Autowired
    ISelectDao selectDao;
    @Override
    public String translate(String slCd, String slValue) {
        SelectBean selectBean = new SelectBean();
        selectBean.setSlCd(slCd);
        selectBean.setSlValue(slValue);
        selectBean = selectDao.findSelectKey(selectBean);
        return selectBean.getSlKey();
    }
}

package com.cbat.starsymbol.service.impl;

import com.cbat.starsymbol.bean.SelectBean;
import com.cbat.starsymbol.dao.ISelectDao;
import com.cbat.starsymbol.service.ISelectService;
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

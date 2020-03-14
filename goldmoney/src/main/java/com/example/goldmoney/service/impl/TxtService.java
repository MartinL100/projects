package com.example.goldmoney.service.impl;

import com.example.goldmoney.bean.TxtBean;
import com.example.goldmoney.dao.ITxtDao;
import com.example.goldmoney.service.ITxtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("txtService")
public class TxtService implements ITxtService {
    @Autowired
    private ITxtDao txtDao;
    @Override
    public List<TxtBean> findTxtDao(TxtBean txtBean) {
        return txtDao.findTxt(txtBean);
    }
}

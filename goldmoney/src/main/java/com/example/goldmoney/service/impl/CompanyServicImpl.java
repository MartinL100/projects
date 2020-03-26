package com.example.goldmoney.service.impl;


import com.example.goldmoney.bean.CompanyBean;
import com.example.goldmoney.dao.ICompanyDao;
import com.example.goldmoney.param.Area;
import com.example.goldmoney.param.ComPayType;
import com.example.goldmoney.param.ComType;
import com.example.goldmoney.service.ICompanyServic;
import com.example.goldmoney.service.ISelectService;
import com.example.goldmoney.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class CompanyServicImpl implements ICompanyServic {
    @Autowired
    ICompanyDao companyDao;
    @Autowired
    ISelectService selectService;
    @Override
    public void addCom(CompanyBean companyBean) {
        companyBean.setComId(StringUtil.getUUID());
        companyBean.setLstModTime(new Timestamp(System.currentTimeMillis()).toString());
        companyDao.addCom(companyBean);
    }

    @Override
    public void updateCom(CompanyBean companyBean) {
        companyBean.setLstModTime(new Timestamp(System.currentTimeMillis()).toString());
        companyDao.updateCom(companyBean);
    }

    @Override
    public List<CompanyBean> findComList(CompanyBean companyBean) {
        List<CompanyBean> companyBeans =  companyDao.findComList(companyBean);
        for (CompanyBean c:companyBeans) {
            c.setComAreaDesc(selectService.translate(Area.Area_CD,c.getComArea()));
            c.setComPayTypeDesc(selectService.translate(ComPayType.CPT_CD,c.getComPayType()));
            c.setComTypeDesc(selectService.translate(ComType.CT_CD,c.getComType()));
        }
        return companyBeans;
    }

    @Override
    public void delCom(CompanyBean companyBean) {
        companyDao.delCom(companyBean);
    }
}

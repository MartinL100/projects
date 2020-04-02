package com.cbat.starsymbol.service.impl;

import com.cbat.starsymbol.bean.CompanyBean;
import com.cbat.starsymbol.dao.ICompanyDao;
import com.cbat.starsymbol.param.Area;
import com.cbat.starsymbol.param.ComPayType;
import com.cbat.starsymbol.param.ComType;
import com.cbat.starsymbol.service.ICompanyServic;
import com.cbat.starsymbol.service.ISelectService;
import com.cbat.starsymbol.util.StringUtil;
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
        if (null==companyBeans){
            return companyBeans;
        }
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

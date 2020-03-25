package com.example.goldmoney.service.impl;


import com.example.goldmoney.bean.LicenceBean;
import com.example.goldmoney.dao.ILicenseDao;
import com.example.goldmoney.param.IsHot;
import com.example.goldmoney.param.LicenceType;
import com.example.goldmoney.service.ILicenseService;
import com.example.goldmoney.service.ISelectService;
import com.example.goldmoney.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class licenseServiceImpl implements ILicenseService {
    @Autowired
    ILicenseDao licenseDao;
    @Autowired
    ISelectService selectService;
    @Override
    public List<LicenceBean> findLicList(LicenceBean licenceBean) {
        List<LicenceBean> licenceBeans = licenseDao.findLicList(licenceBean);
        //翻译
        for (LicenceBean lic:licenceBeans) {
            lic.setLicTypeDesc(selectService.translate(LicenceType.LT_CD,lic.getLicType()));
            lic.setLicLeveDesc(selectService.translate(IsHot.IH_CD,lic.getLicLeve()));
        }

        return licenceBeans;
    }

    @Override
    public Integer countLic(LicenceBean licenceBean) {
        return licenseDao.countLic(licenceBean);
    }

    @Override
    public void addLic(LicenceBean licenceBean) {
        licenceBean.setLicId(StringUtil.getUUID());
        licenceBean.setLicLeve(IsHot.LV_1);
        licenceBean.setLstModTime(new Timestamp(System.currentTimeMillis()).toString());
        licenseDao.addLic(licenceBean);
    }

    @Override
    public void updateLic(LicenceBean licenceBean) {
        licenceBean.setLstModTime(new Timestamp(System.currentTimeMillis()).toString());
        licenseDao.updateLic(licenceBean);
    }

    @Override
    public void delLic(LicenceBean licenceBean) {
        licenseDao.delLic(licenceBean);
    }
}

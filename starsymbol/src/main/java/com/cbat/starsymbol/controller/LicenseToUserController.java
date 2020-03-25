package com.cbat.starsymbol.controller;

import com.cbat.starsymbol.bean.LicenceBean;
import com.cbat.starsymbol.bean.PageQueryBean;
import com.cbat.starsymbol.service.ILicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LicenseToUserController {
    @Autowired
    ILicenseService licenseService;

    @RequestMapping("/findLics")
    public List<LicenceBean> findLicense(LicenceBean licenceBean){
        return licenseService.findLicList(licenceBean);
    }

    @RequestMapping("/getLicInf")
    public LicenceBean getLicInf(String licId){
        LicenceBean licenceBean = new LicenceBean();
        licenceBean.setLicId(licId);
        return licenseService.findLicList(licenceBean).get(0);
    }

}

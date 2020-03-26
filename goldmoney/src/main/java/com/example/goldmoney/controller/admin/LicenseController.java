package com.example.goldmoney.controller.admin;


import com.example.goldmoney.bean.LicenceBean;
import com.example.goldmoney.bean.PageQueryBean;
import com.example.goldmoney.service.ILicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/manager")
@RestController
public class LicenseController {
    @Autowired
    ILicenseService licenseService;
    @RequestMapping("/addLic")
    public void addLicense(LicenceBean licenceBean){
        licenseService.addLic(licenceBean);
    }
    @RequestMapping("/queryLic")
    public PageQueryBean findLicense(LicenceBean licenceBean){
        licenceBean.setIndex((licenceBean.getPage()-1)*10);//设置分页信息
        PageQueryBean pageQueryBean = new PageQueryBean();
        pageQueryBean.setData(licenseService.findLicList(licenceBean));
        return pageQueryBean;
    }
    @RequestMapping("/getLicInf")
    public LicenceBean getLicInf(String licId){
        LicenceBean licenceBean = new LicenceBean();
        licenceBean.setLicId(licId);
        return licenseService.findLicList(licenceBean).get(0);
    }
    @RequestMapping("/updateLic")
    public void updateLic(LicenceBean licenceBean){
        licenseService.updateLic(licenceBean);
    }
    @RequestMapping("/delLic")
    public void delLic(LicenceBean licenceBean){
        licenseService.delLic(licenceBean);
    }

}

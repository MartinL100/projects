package com.cbat.starsymbol.controller.admin;


import com.cbat.starsymbol.bean.CompanyBean;
import com.cbat.starsymbol.bean.PageQueryBean;
import com.cbat.starsymbol.service.ICompanyServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/manager")
@RestController
public class CompanyController {
    @Autowired
    ICompanyServic companyServic;
    @RequestMapping("/addCom")
    public void addCom(CompanyBean companyBean){
        companyServic.addCom(companyBean);
    }
    @RequestMapping("/queryComs")
    public PageQueryBean queryComs(CompanyBean companyBean){
        if(!StringUtils.isEmpty(companyBean.getPage()))
        companyBean.setIndex((companyBean.getPage()-1)*10);//设置分页信息
        PageQueryBean pageQueryBean = new PageQueryBean();
        pageQueryBean.setData(companyServic.findComList(companyBean));
        return  pageQueryBean;
    }

    @RequestMapping("/delCom")
    public void delCom(CompanyBean companyBean){
        companyServic.delCom(companyBean);
    }
    @RequestMapping("/updateCom")
    public void updateCom(CompanyBean companyBean){
        companyServic.updateCom(companyBean);
    }
    @RequestMapping("/getComInfo")
    public CompanyBean getComInfo(CompanyBean companyBean){
        return   companyServic.findComList(companyBean).get(0);
    }


}

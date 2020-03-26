package com.cbat.starsymbol.service;

import com.cbat.starsymbol.bean.CompanyBean;

import java.util.List;

public interface ICompanyServic {

    void addCom(CompanyBean companyBean);
    void updateCom(CompanyBean companyBean);
    List<CompanyBean> findComList(CompanyBean companyBean);
    void delCom(CompanyBean companyBean);
}

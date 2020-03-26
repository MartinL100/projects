package com.example.goldmoney.service;


import com.example.goldmoney.bean.CompanyBean;

import java.util.List;

public interface ICompanyServic {

    void addCom(CompanyBean companyBean);
    void updateCom(CompanyBean companyBean);
    List<CompanyBean> findComList(CompanyBean companyBean);
    void delCom(CompanyBean companyBean);
}

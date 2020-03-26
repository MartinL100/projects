package com.cbat.starsymbol.dao;


import com.cbat.starsymbol.bean.CompanyBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICompanyDao {

    void addCom(CompanyBean companyBean);
    void updateCom(CompanyBean companyBean);
    List<CompanyBean> findComList(CompanyBean companyBean);
    void delCom(CompanyBean companyBean);
    Integer countCom(CompanyBean companyBean);
}

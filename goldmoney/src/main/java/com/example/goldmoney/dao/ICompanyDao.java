package com.example.goldmoney.dao;

import com.example.goldmoney.bean.CompanyBean;
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

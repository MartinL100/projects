package com.example.goldmoney.controller;


import com.example.goldmoney.bean.CompanyBean;
import com.example.goldmoney.service.ICompanyServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComToUserController {
    @Autowired
    ICompanyServic companyServic;
    @RequestMapping("/findComs")
    public List<CompanyBean>findComs(CompanyBean companyBean){
        return companyServic.findComList(companyBean);
    }
}

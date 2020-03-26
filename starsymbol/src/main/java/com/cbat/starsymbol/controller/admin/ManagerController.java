package com.cbat.starsymbol.controller.admin;


import com.cbat.starsymbol.bean.PageQueryBean;
import com.cbat.starsymbol.bean.TxtBean;
import com.cbat.starsymbol.service.ITxtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/manager")
@RestController
public class ManagerController {
    @Autowired
    ITxtService txtService;

    @RequestMapping("/getTxtList")
    public PageQueryBean getTxtByType(TxtBean txtBean){
        txtBean.setIndex((txtBean.getPage()-1)*10);//设置分页信息
        PageQueryBean pageQueryBean = new PageQueryBean();
        pageQueryBean.setData(txtService.findTxtAndSelect(txtBean));
        pageQueryBean.setCount(txtService.countCommon(txtBean));
        return pageQueryBean;
    }
    @RequestMapping("/updateTxtLv")
    public void updateTxtLv(TxtBean txtBean){
        txtService.updateTxtLv(txtBean);
    }

    @RequestMapping("/updateTxtLvs")
    public void updateTxtLvs(@RequestParam(value = "txtList") List<TxtBean> txtBeans){
        for (TxtBean txtBean:txtBeans) {
            txtService.updateTxtLv(txtBean);
        }
    }


    @RequestMapping("/addTxt")
    public void addTxt(TxtBean txtBean){
        txtService.addTxt(txtBean);
    }
}

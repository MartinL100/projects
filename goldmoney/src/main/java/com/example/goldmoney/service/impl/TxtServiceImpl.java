package com.example.goldmoney.service.impl;

import com.example.goldmoney.bean.SelectBean;
import com.example.goldmoney.bean.TxtBean;
import com.example.goldmoney.dao.ISelectDao;
import com.example.goldmoney.dao.ITxtDao;
import com.example.goldmoney.param.TxtType;
import com.example.goldmoney.service.ITxtService;
import com.example.goldmoney.util.StringUtil;
import com.example.goldmoney.param.TxtLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("txtService")
public class TxtServiceImpl implements ITxtService {
    @Autowired
    private ITxtDao txtDao;
    @Autowired
    private ISelectDao selectDao;
    @Override
    public List<TxtBean> findTxt(TxtBean txtBean) {
        return txtDao.findTxt(txtBean);
    }

    @Override
    public void addTxt(TxtBean txtBean) {
        txtBean.setTxtId(StringUtil.getUUID());
        txtBean.setTxtLevel(TxtLevel.LV_1);
        txtBean.setLstModTime(new Timestamp(System.currentTimeMillis()).toString());
        txtDao.addTxt(txtBean);
    }

    @Override
    public List<TxtBean> findTxtAndSelect(TxtBean txtBean) {
        List<TxtBean> txtBeans = txtDao.findTxtCommon(txtBean);
        for (TxtBean t:txtBeans) {
            //此处翻译下拉
           t.setTxtTypeDesc(translate(TxtType.SL_CD,t.getTxtType()));
           t.setTxtLevelDesc(translate(TxtLevel.SL_CD,t.getTxtLevel()));
        }

        return txtBeans;
    }

    @Override
    public int countCommon(TxtBean txtBean) {
        return txtDao.countCommon(txtBean);
    }

    @Override
    public void updateTxtLv(TxtBean txtBean) {
        txtDao.updateTxtLv(txtBean);
    }


    public String translate(String slCd,String slValue){
        SelectBean selectBean = new SelectBean();
        selectBean.setSlCd(slCd);
        selectBean.setSlValue(slValue);
        selectBean = selectDao.findSelectKey(selectBean);
        return selectBean.getSlKey();
    }

}

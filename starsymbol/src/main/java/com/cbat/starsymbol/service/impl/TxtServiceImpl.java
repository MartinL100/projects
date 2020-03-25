package com.cbat.starsymbol.service.impl;

import com.cbat.starsymbol.bean.TxtBean;
import com.cbat.starsymbol.dao.ITxtDao;
import com.cbat.starsymbol.param.TxtLevel;
import com.cbat.starsymbol.param.TxtType;
import com.cbat.starsymbol.service.ISelectService;
import com.cbat.starsymbol.service.ITxtService;
import com.cbat.starsymbol.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service("txtService")
public class TxtServiceImpl implements ITxtService {
    @Autowired
    private ITxtDao txtDao;
    @Autowired
    private ISelectService selectService;
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
           t.setTxtTypeDesc(selectService.translate(TxtType.SL_CD,t.getTxtType()));
           t.setTxtLevelDesc(selectService.translate(TxtLevel.SL_CD,t.getTxtLevel()));
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




}

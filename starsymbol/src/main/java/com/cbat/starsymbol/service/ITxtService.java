package com.cbat.starsymbol.service;



import com.cbat.starsymbol.bean.TxtBean;

import java.util.List;


public interface ITxtService {

    List<TxtBean> findTxt(TxtBean txtBean);
    void addTxt(TxtBean txtBean);
    List<TxtBean> findTxtAndSelect(TxtBean txtBean);
    int countCommon(TxtBean txtBean);
    void updateTxtLv(TxtBean txtBean);

}

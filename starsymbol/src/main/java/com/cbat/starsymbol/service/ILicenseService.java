package com.cbat.starsymbol.service;

import com.cbat.starsymbol.bean.LicenceBean;

import java.util.List;

public interface ILicenseService {

    List<LicenceBean> findLicList(LicenceBean licenceBean);

    Integer countLic(LicenceBean licenceBean);

    void addLic(LicenceBean licenceBean);

    void updateLic(LicenceBean licenceBean);
    void delLic(LicenceBean licenceBean);
}

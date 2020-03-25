package com.cbat.starsymbol.dao;

import com.cbat.starsymbol.bean.LicenceBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ILicenseDao {

     List<LicenceBean> findLicList(LicenceBean licenceBean);

    Integer countLic(LicenceBean licenceBean);

     void addLic(LicenceBean licenceBean);

     void updateLic(LicenceBean licenceBean);

     void delLic(LicenceBean licenceBean);
}

package com.example.goldmoney.dao;

import com.example.goldmoney.bean.TxtBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ITxtDao {

    List<TxtBean> findTxt(TxtBean txtBean);
}

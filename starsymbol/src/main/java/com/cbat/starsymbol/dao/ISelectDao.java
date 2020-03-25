package com.cbat.starsymbol.dao;


import com.cbat.starsymbol.bean.SelectBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISelectDao {
    SelectBean findSelectKey(SelectBean selectBean);
}

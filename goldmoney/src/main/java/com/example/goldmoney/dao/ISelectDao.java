package com.example.goldmoney.dao;



import com.example.goldmoney.bean.SelectBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ISelectDao {
    SelectBean findSelectKey(SelectBean selectBean);
}

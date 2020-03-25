package com.cbat.starsymbol.dao;


import com.cbat.starsymbol.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao {

    void addUser(UserBean userBean);

    UserBean findUser(UserBean userBean);

    UserBean findUserByUserName(UserBean userBean);

    UserBean findUserByTel(UserBean userBean);
}

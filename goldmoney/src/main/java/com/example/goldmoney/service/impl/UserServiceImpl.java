package com.example.goldmoney.service.impl;

import com.example.goldmoney.bean.UserBean;
import com.example.goldmoney.dao.IUserDao;
import com.example.goldmoney.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public UserBean logIn(UserBean userBean) {
        if (StringUtils.isEmpty(userBean.getUserName())||StringUtils.isEmpty(userBean.getPwd())){
            return null;
        }
        UserBean user = userDao.findUserByUserName(userBean);
        if (null==user){
            user = userDao.findUserByTel(userBean);
        }
        return user;
    }
}

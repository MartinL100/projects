package com.cbat.starsymbol.controller;

import com.cbat.starsymbol.bean.UserBean;
import com.cbat.starsymbol.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping("/login")
    public Boolean login(UserBean userBean, HttpServletRequest request){
        boolean islog = false;
        UserBean user = userService.logIn(userBean);
        if (null!=user){
            islog = true;
            request.getSession().setAttribute("user",user);
        }

        return islog;
    }

}

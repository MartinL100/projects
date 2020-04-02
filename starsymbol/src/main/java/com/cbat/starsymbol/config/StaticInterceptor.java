package com.cbat.starsymbol.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class StaticInterceptor   implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        Boolean needCheck = url.contains("/manager")
                &&!url.contains("/login")
                &&!url.endsWith(".js")
                &&!url.endsWith(".css")
                &&!url.contains("/manager/layuiadmin");
        if (needCheck){
            Object  user = request.getSession().getAttribute("user");
            if (null==user){
                    response.sendRedirect("/manager/login.html");
                    return false;
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
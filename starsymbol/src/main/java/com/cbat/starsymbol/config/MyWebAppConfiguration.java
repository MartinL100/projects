package com.cbat.starsymbol.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: appbuilder
 * @description:
 * @author: seanol
 * @create: 2018-12-26 19:50
 **/
@PropertySource({"classpath:application.properties"})
@Configuration
public class MyWebAppConfiguration implements WebMvcConfigurer {
    @Value("${img.path}")
    private String imgPath;
    @Value("${img.url}")
    private String url;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new StaticInterceptor())
                .addPathPatterns("/**")//添加拦截路径
                .excludePathPatterns("/static/**")  //排除拦截路径
                .excludePathPatterns("/src/**")  ;//排除拦截路径
//        registry.addInterceptor(new CbatMonitorInterceptor())
//                .addPathPatterns("/**");//添加拦截路径

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/"+url+"/**")
                .addResourceLocations("file:/"+imgPath);

    }
}
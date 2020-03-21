package com.example.goldmoney.param;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config/TxtTypeConfig.properties")
public class TxtType {
    public static  String SL_CD="txtType";
    /**代理记账*/
    public static  String TYPE_1="01";
    /**行政许可*/
    public static  String TYPE_2="02";
    /**工商注册*/
    public static  String TYPE_3="03";

}

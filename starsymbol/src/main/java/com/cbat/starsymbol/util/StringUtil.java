package com.cbat.starsymbol.util;

import cn.hutool.core.lang.UUID;

public class StringUtil {

    public  static String getUUID(){
        return UUID.fastUUID().toString().replace("-","");
    }
}

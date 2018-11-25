package com.tck.shenghe.utils;

import java.util.Random;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/25
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     *
     * @return
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}

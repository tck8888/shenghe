package com.tck.shenghe.utils;

import com.tck.shenghe.enums.CodeEnum;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}

package com.tck.shenghe.exception;

import com.tck.shenghe.enums.ResultEnum;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/25
 **/
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

package com.tck.shenghe.VO;

import lombok.Data;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}


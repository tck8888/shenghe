package com.tck.shenghe.dto;

import lombok.Data;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

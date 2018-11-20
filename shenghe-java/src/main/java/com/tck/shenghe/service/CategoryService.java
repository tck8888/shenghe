package com.tck.shenghe.service;

import com.tck.shenghe.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

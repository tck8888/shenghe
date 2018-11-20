package com.tck.shenghe.repository;

import com.tck.shenghe.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}

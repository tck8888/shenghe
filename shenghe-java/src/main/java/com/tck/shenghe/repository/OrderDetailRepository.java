package com.tck.shenghe.repository;

import com.tck.shenghe.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}

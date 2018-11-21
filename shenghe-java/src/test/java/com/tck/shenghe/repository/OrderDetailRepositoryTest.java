package com.tck.shenghe.repository;

import com.tck.shenghe.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("111111111");
        orderDetail.setProductId("1111111112");
        orderDetail.setProductIcon("http://xxx.png");
        orderDetail.setProductName("皮蛋瘦肉粥");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(2);
        repository.save(orderDetail);
    }

    @Test
    public void findByOrderId() {
    }
}
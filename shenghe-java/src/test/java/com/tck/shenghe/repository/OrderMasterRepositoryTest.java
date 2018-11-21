package com.tck.shenghe.repository;

import com.tck.shenghe.dataobject.OrderMaster;
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
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("tck");
        orderMaster.setBuyerPhone("10086");
        orderMaster.setBuyerAddress("中国");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        repository.save(orderMaster);
    }
    @Test
    public void findByBuyerOpenid() {
    }
}
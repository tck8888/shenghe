package com.tck.shenghe.service.impl;

import com.tck.shenghe.dataobject.OrderDetail;
import com.tck.shenghe.dto.OrderDTO;
import com.tck.shenghe.repository.OrderDetailRepository;
import com.tck.shenghe.repository.OrderMasterRepository;
import com.tck.shenghe.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/25
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;


    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("tck");
        orderDTO.setBuyerAddress("上海");
        orderDTO.setBuyerName("tck");
        orderDTO.setBuyerPhone("100086");
        orderDTO.setBuyerOpenid("1101110");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123456");
        orderDetail.setProductQuantity(2);
        orderDetail.setProductPrice(new BigDecimal(3));
        orderDetailList.add(orderDetail);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderService.create(orderDTO);
        log.info("====================", result);
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }

    @Test
    public void findList1() {
    }
}
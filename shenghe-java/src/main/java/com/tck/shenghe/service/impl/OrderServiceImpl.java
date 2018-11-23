package com.tck.shenghe.service.impl;

import com.tck.shenghe.dataobject.OrderDetail;
import com.tck.shenghe.dataobject.ProductInfo;
import com.tck.shenghe.dto.OrderDTO;
import com.tck.shenghe.repository.ProductInfoRepository;
import com.tck.shenghe.service.OrderService;
import com.tck.shenghe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Author:tck
 * @Description:
 * @Date:2018/11/24
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //1.查询商品的数量，价格
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
        }
        //计算总价
        //写入订单数据库orderMaster和orderDetail
        //扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(Pageable pageable) {
        return null;
    }
}

package com.dsb.provide.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsb.provide.dto.OrderDto;
import com.dsb.provide.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDto getOrderInfoById(Integer id) {
        OrderDto orderDto = null;
        if (id == 1) {
            orderDto = new OrderDto();
            orderDto.setId(1);
            orderDto.setNo("11111111");
            orderDto.setName("测试1");
        }
        return orderDto;
    }
}

package com.dsb.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dsb.provide.dto.OrderDto;
import com.dsb.provide.service.OrderService;
import com.dsb.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference
    private OrderService orderService;
    @Reference
    private UserService userService;

    @GetMapping("/{id}")
    public OrderDto getOrderInfoById(@PathVariable("id") Integer id) {
        System.out.println("进入getOrderInfoById=======");
        return orderService.getOrderInfoById(id);
    }

    @GetMapping("/getName")
    public String getUserName() {
        return userService.getName();
    }

}

package com.dsb.user.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsb.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        System.out.println("============进入getName===========");
        return "测试Name";
    }
}

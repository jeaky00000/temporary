package com.dabao.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dabao.service.UserService;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String findUser() {
        return "zhaitongbao.....";
    }
}

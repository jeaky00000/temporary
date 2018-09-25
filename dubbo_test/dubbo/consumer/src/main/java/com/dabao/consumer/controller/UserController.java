package com.dabao.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dabao.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public String FindUser(){
        String user =  userService.findUser();
        System.out.println(user);
        return user;
    }
}

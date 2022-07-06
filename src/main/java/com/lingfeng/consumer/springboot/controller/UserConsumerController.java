package com.lingfeng.consumer.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lingfeng.provider.springboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/consumer/controller")
public class UserConsumerController {
    @Reference
    UserService userService;
    @PostMapping("/username")
    public String getUserNameById(){
        String userName = userService.getUserNameById("8888");
        System.out.println(userName);
        return userName;
    }
}

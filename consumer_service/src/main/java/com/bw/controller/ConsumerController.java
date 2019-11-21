package com.bw.controller;

import com.bw.client.ProviderFeignImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeignImpl ProviderFeignImpl;


    @RequestMapping("/user/list")
    public List<String>  showUsers(){

        //return Arrays.asList("张安","李四","王五");
        return ProviderFeignImpl.selectAllUsers();
    }
}
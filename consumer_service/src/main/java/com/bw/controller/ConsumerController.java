package com.bw.controller;

import com.bw.client.ProviderFeignImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@EnableFeignClients
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeignImpl providerfeignimpl;

    @RequestMapping("/user/list")
    public List<String> showList()
    {
        /*return Arrays.asList("张三","李四","王五","孙六","田七");*/
            return providerfeignimpl.selectAllUser();
    }

}

package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderServer {

    @RequestMapping("/users")
    public List<String> showList()
    {
        return Arrays.asList("张三","李四","王五","孙六","田七");
    }

}

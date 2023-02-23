package com.zhang.controller;

import com.zhang.service.MybatisPlusTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mybatisTet")
public class MybatisPlusTestController {

    @Autowired
    private MybatisPlusTestService mybatisPlusTestService;

    @RequestMapping("/list")
    public String getList(){
        return mybatisPlusTestService.getList();
    }

}

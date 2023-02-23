package com.zhang.controller;

import com.zhang.pojo.TestOrder;
import com.zhang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testMethod")
    public String testMethod(String string){
        return testService.getString(string);
    }

    @RequestMapping("/getRedis")
    public String getRedis(String key){
        return testService.getRedis(key);
    }

    @RequestMapping("/asyncTest/{string}")
    public String asyncTest(@PathVariable("string") String string) throws InterruptedException {
        /*Thread.sleep(3000);*/
        async(string);
        return "TestString : " + string;
    }

    @Async("asyncTest")
    public void async(String string) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Async :" + string);
    }



}

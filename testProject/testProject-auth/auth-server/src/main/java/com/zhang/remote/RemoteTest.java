package com.zhang.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "auth",path = "/test")
public interface RemoteTest {


    @RequestMapping("/testMethod")
    public String testMethod(String string);

}

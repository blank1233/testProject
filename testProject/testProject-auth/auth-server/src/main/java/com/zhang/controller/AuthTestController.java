package com.zhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthTestController {


    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }

}

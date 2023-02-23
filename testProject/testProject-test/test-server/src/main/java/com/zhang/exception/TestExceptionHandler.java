package com.zhang.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestExceptionHandler {

    @ExceptionHandler({Exception.class})
    public String testException(Exception e){
        System.out.println(e);
        return "测试模块异常";
    }

}

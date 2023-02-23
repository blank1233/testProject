package com.zhang.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class MethodLogProxy {

    @Pointcut()
    public void methodPointCut(){

    }

    @Around(value = "execution(* com.zhang.controller.*.*(..))")
    public Object methodLog(ProceedingJoinPoint pjp) throws Throwable {
        log.info(pjp.getSignature().getName() + "方法被调用了");
        log.info("传入参数为：" + Arrays.toString(pjp.getArgs()));
        Object result = pjp.proceed();
        log.info("返回值为：" + result);
        return result;
    }
}

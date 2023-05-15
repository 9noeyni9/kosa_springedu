package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@Slf4j
public class AOPLab3 {

    @Around("execution(public * com.example.springedu.controller.EmpController.*())")
    public Object aroundInfoLog(ProceedingJoinPoint jp){

        StopWatch sw = new StopWatch();
        Object result = null;

        try {
            sw.start();
            result= jp.proceed();
            sw.stop();
            log.info(jp.getTarget().getClass().getName()+"- 수행시간(밀리초) -"+sw.getTotalTimeMillis());

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return result;

    }
}

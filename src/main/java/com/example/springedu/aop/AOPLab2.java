package com.example.springedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPLab2 {

    @Before("execution(public String com.example.springedu.controller.MultiController.select_proc(..))")
    public void beforeSelectAdvice(JoinPoint joinPoint){
        System.out.println("[AOP]"+joinPoint.getSignature().getName()+"수행 전");
    }

    @After("execution(public String com.example.springedu.controller.MultiController.search_proc(..))")
    public void afterSearchAdvice(JoinPoint joinPoint){
        System.out.println("[AOP]" + joinPoint.getSignature().getName()+"수행 후");
    }
}

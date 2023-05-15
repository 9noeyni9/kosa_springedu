package com.example.springedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPLab1 {

    @Pointcut("execution(public String com.example.springedu.controller.HelloController.hello(*))")
    public void helloPointCut(){

    }
    @Before("helloPointCut()")
    public void beforeHelloAdvice(JoinPoint joinPoint){
        System.out.println("[AOP]"+ joinPoint.getSignature().getName() +"수행 전");
    }
    
    @After("helloPointCut()")
    public void afterHelloAdvice(JoinPoint joinPoint){
        System.out.println("[AOP]" + joinPoint.getSignature().getName() + "수행 후");
    }

}

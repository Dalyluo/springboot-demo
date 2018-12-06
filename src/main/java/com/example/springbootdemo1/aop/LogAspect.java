package com.example.springbootdemo1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.List;

@Aspect
public class LogAspect {

    @Before("execution(* com.example.springbootdemo1.service.impl.*.*(..))")
    public void before(JoinPoint join){
        String methodName = join.getSignature().getName();
        //获取参数列表
        List<Object> args = Arrays.asList(join.getArgs());
        System.out.println("前置通知---->before   方法名是:"+methodName+"\t参数列表是:"+args);
    }

    @After("execution(* com.example.springbootdemo1.service.impl.*.*(..))")
    public void after(){
        System.out.println("后置通知---->after....");
    }
}

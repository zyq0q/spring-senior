package com.aopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by zyq on 2021/3/7.
 */
@Component
@Aspect
@Slf4j
public class MethodProceedTimeAspect {

    @Pointcut("@annotation(com.aopdemo.annotation.MethodProceedTime)")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
      log.info(">>>>>>>>>>>>>>before");
    }

    @After("pointcut()")
    public void after(){
        log.info(">>>>>>>>>>>>>>after");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        //拦截的类名
        Class clazz = joinPoint.getTarget().getClass();
        //拦截的方法
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        log.info("执行了类:" + clazz + " 方法:" + method );
        long timeStart = System.currentTimeMillis();
        log.info("执行方法前");
        Object obj = joinPoint.proceed();
        log.info("执行方法结束");
        long timeEnd = System.currentTimeMillis();
        log.info("方法执行时长毫秒 ："+ (timeEnd-timeStart));
        return obj;
    }




}

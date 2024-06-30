package com.sea4.demo.component;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;



@Slf4j
@Aspect
@Component
public class DemoAop {

  @Pointcut("execution(* com.sea4.demo..*.*(..))")
  private void cut(){}

  @Before("cut()")
  public void before(JoinPoint joinPoint){
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    Method method = methodSignature.getMethod();
    log.info(method.getName());
    Object[] args = joinPoint.getArgs();
    for(Object obj : args){
      log.info("type : {}", obj.getClass().getSimpleName());
      log.info("value : {}", obj);
    }
  }

  @AfterReturning(value = "cut()", returning = "returnObj")
  public void afterReturn(JoinPoint joinPoint, Object returnObj){
    log.info("return obj : {}", returnObj);
  }

}

package com.example.ex05.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration
@Aspect
@Slf4j
public class LogAspect {
    @Before("@annotation(com.example.ex05.aspect.annotation.LogStatus)")
    public void beforeStart(JoinPoint joinPoint){
        log.info("========================================================");
        log.info("Method " + joinPoint.getSignature().getName() + " Started at " + LocalDateTime.now());
        log.info("Arguments:"+ Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(", ")));
        log.info("========================================================");
    }


    @After("@annotation(com.example.ex05.aspect.annotation.LogStatus)")
    public void afterStart(JoinPoint joinPoint){
        log.info("========================================================");
        log.info("Method " + joinPoint.getSignature().getName() + " Ended at " + LocalDateTime.now());
        log.info("========================================================");
    }

    //리턴값을 먼저 출력하기위해 사용
    @AfterReturning(value="@annotation(com.example.ex05.aspect.annotation.LogStatus)", returning = "returnValue")
    public void arterReturningStart(JoinPoint joinPoint, Integer returnValue){
        log.info("========================================================");
        log.info("Method " + joinPoint.getSignature().getName() + " Returned"+returnValue +" at " + LocalDateTime.now());
        log.info("========================================================");
    }

    @AfterThrowing(value="@annotation(com.example.ex05.aspect.annotation.LogStatus)", throwing="e")
    public void afterThrowingStart(NumberFormatException e){
        log.info("Wrong parameter, change to Integer");
    }




}



















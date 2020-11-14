package com.bjpowernode.aop.developments;

import org.aspectj.lang.ProceedingJoinPoint;

public class AccountHelper {

    public void valid() {
        System.out.println("检查身份");
    }

    public void check() {
        System.out.println("检查余额");
    }

    public void statement() {
        System.out.println("生成对账单");
    }

    public void sendMsg() {
        System.out.println("发短信");
    }

    public void around(ProceedingJoinPoint point) throws Throwable {
        valid();
        point.proceed();
        statement();
    }

    public void exception(){
        System.out.println("程序抛异常");
    }

}

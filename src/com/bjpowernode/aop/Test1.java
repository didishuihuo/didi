package com.bjpowernode.aop;


import com.bjpowernode.aop.developments.IAccount;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-aop.xml");

        IAccount account = (IAccount)applicationContext.getBean("account");
        account.out();

        System.out.println(account.getClass());


    }
}

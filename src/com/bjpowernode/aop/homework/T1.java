package com.bjpowernode.aop.homework;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class T1 {
    public static void main(String[] args) {

        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-aaop.xml");
        //IController controller = (IController)applicationContext.getBean("controller");

        IController controller = applicationContext.getBean(IController.class);
        controller.use();

    }
}

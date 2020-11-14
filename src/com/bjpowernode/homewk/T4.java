package com.bjpowernode.homewk;

import com.bjpowernode.homewk.bean.TClass;
import com.bjpowernode.homewk.controller.BankController;
import com.bjpowernode.homewk.controller.ClassController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class T4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml","spring-datasource.xml","spring-tx.xml");
        /*ClassController classController = applicationContext.getBean(ClassController.class);
        List<TClass> list = classController.list();
        for (TClass tClass : list) {
            System.out.println(tClass);
        }*/

        BankController bankController = applicationContext.getBean(BankController.class);
        bankController.transfer();


    }
}

package com.bjpowernode.aop.homework;

import org.springframework.stereotype.Component;

@Component
public class Controller implements IController {

    //5.控制器的每一个方法一般做4件事：1.接受表单的值 2.调用模型层 3.将模型层取出的数据存入request 4.响应用户  现要求控制器仅仅保留调用模型层的步骤，其余的步骤全部从控制器剥离出去，这样就能使控制的每一个方法都简化成一行代码（实际上springmvc真的是这样做的）（环绕通知）
    //
    //6.在service层，用户做增删改操作之前，自动帮助用户去开启事务，增删改操作之后再自动提交事务（环绕通知）
    @Override
    public void use() {
        System.out.println("调用模型层");
    }
}

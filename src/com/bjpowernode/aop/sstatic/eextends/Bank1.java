package com.bjpowernode.aop.sstatic.eextends;

public class Bank1 extends Out {
    public void valid(){
        System.out.println("检查身份");
    }

    public void check(){
        System.out.println("检查余额");
    }

    public void statement(){
        System.out.println("生成对账单");
    }

    public void sendMsg(){
        System.out.println("发短信");
    }

    @Override
    public void out() {
        valid();
        check();
        super.out();
        statement();
        sendMsg();
    }
}

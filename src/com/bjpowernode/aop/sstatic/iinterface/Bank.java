package com.bjpowernode.aop.sstatic.iinterface;

public class Bank implements IOut {

    @Override
    public void out() {
        System.out.println("从账户扣一百块");
    }
}

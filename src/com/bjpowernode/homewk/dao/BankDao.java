package com.bjpowernode.homewk.dao;

import com.bjpowernode.homewk.bean.Bank;

public interface BankDao {


    int out(String nid, int money);


    int in(String nid, int money);


}
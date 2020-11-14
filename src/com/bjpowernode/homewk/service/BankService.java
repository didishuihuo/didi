package com.bjpowernode.homewk.service;

import com.bjpowernode.homewk.dao.BankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService implements IBankService {

    @Autowired
    BankDao bankDao;

    @Override
    public void transfer(String outId, String inId, int money) {

        bankDao.out(outId, money);
        bankDao.in(inId, money);

    }
}

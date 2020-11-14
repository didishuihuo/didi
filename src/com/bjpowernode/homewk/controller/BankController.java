package com.bjpowernode.homewk.controller;

import com.bjpowernode.homewk.service.IBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankController {

    @Autowired
    IBankService bankService;

    public void transfer(){
        bankService.transfer("1", "2", 1000);

    }


}

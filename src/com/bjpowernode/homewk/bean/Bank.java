package com.bjpowernode.homewk.bean;

import java.io.Serializable;

/**
 * t_bank
 * @author 
 */
public class Bank implements Serializable {
    /**
     * id号
     */
    private Integer nid;

    /**
     * 余额
     */
    private Integer money;

    private static final long serialVersionUID = 1L;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
package com.designpattern.strategy.pay.payport;

import com.designpattern.strategy.pay.MsgResult;

public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}

package com.designpattern.strategy.pay.payport;

public class WeChatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 369;
    }
}

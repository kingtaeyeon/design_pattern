package com.designpattern.strategy.pay.payport;

import com.designpattern.strategy.pay.MsgResult;

/***
 * 支付渠道
 * @Author: LiHao
 * @Since: 2020/11/16 15:26
 */
public abstract class Payment {

    public abstract String getName();

    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < 500) {
            return new MsgResult(200, "支付失败", "余额不足");
        }
        return new MsgResult(500, "支付成功", "支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);
}

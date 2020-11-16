package com.designpattern.strategy.promotion;

/**
 * 返现促销策略
 * @Author: LiHao
 * @Since: 2020/11/16 14:01
 */
public class CashBackStrategy implements IPromotionStrategy{
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}

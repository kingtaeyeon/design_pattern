package com.designpattern.strategy.promotion;

/***
 * 无优惠策略
 * @Author: LiHao
 * @Since: 2020/11/16 14:24
 */
public class EmptyStrategy implements IPromotionStrategy{
    public void doPromotion() {
        System.out.println("无优惠");
    }
}

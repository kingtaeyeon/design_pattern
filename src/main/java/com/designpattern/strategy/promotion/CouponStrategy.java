package com.designpattern.strategy.promotion;

/***
 * 优惠券抵扣策略
 * @Author: LiHao
 * @Since: 2020/11/16 13:57
 */
public class CouponStrategy implements IPromotionStrategy{

    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}

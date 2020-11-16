package com.designpattern.strategy.promotion;

import java.sql.SQLOutput;

/**
 * 拼团优惠策略
 * @Author: LiHao
 * @Since: 2020/11/16 14:08
 */
public class GroupBuyStrategy implements IPromotionStrategy{
    public void doPromotion() {
        System.out.println("5人拼团，可以优惠");
    }
}

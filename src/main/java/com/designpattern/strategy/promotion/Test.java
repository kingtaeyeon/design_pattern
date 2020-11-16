package com.designpattern.strategy.promotion;

import com.designpattern.strategy.pay.Order;
import com.designpattern.strategy.pay.payport.PayStrategy;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashBackStrategy());
//
//        promotionActivity618.execute();
//        promotionActivity1111.execute();

//        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();
//        String promotionKey = "COUPON";
//        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
//        promotionStrategy.doPromotion();

        Order order = new Order("1", "20201116162530456", 1000);
        System.out.println(order.pay(PayStrategy.ALI_PAY));

    }
}

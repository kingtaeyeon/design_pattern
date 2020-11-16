package com.designpattern.strategy.promotion;

public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.strategy = promotionStrategy;
    }

    public void execute() {
        strategy.doPromotion();
    }
}

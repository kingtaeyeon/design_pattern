package com.designpattern.proxy.staticproxy;

public class ZhangLaosan implements IPerson{

    private ZhangSan zhangSan;

    public ZhangLaosan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    public void findLove() {
        System.out.println("张老三开始物色");
        zhangSan.findLove();
        System.out.println("开始交往");
    }
}

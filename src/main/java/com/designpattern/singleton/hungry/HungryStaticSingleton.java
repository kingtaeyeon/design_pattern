package com.designpattern.singleton.hungry;

/**
 * 饿汉式静态块单例模式
 * @Author: LiHao
 * @Since: 2020/8/12 11:40
 */
public class HungryStaticSingleton {

    /** 先静态、后动态
     * 先属性、后方法
     * 先上后下
     **/
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}

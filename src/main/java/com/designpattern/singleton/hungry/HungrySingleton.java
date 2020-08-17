package com.designpattern.singleton.hungry;

/**
 * 饿汉式单例
 * 优点： 执行效率高，性能高，没有任何的锁
 * 缺点： 某些情况下，会造成内存浪费
 * @Author: LiHao
 * @Since: 2020/8/12 11:10
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    private static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

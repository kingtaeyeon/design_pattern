package com.designpattern.singleton.lazy;

/**
 * 优点：节省了内存，线程安全
 * 缺点： 性能低
 * @Author: LiHao
 * @Since: 2020/8/12 17:03
 */
public class LazySimpleSingleton {

    //静态代码块，公共内存区域
    private static LazySimpleSingleton instance;

    public synchronized static LazySimpleSingleton getInstance() {
        if(instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}

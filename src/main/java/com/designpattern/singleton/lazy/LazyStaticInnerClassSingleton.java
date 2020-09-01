package com.designpattern.singleton.lazy;

// 这种形式兼顾饿汉式单例模式的内存浪费问题和synchronized的性能问题
// 完美地屏蔽了这两个缺点
public class LazyStaticInnerClassSingleton {

    // 使用LazyInnerClassSingGeneral的时候，优先会初始化这个内部类
    // 如果没使用，则内部类是不加载的
    private LazyStaticInnerClassSingleton() {
        if( LazyHolder.LAZY != null ) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 每一个关键字都不是多余的，static是为了使单例的空间共享，保证这个方法不会被重写和重载
    public static final LazyStaticInnerClassSingleton getInstance() {

        // 在返回结果之前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton LAZY = new LazyStaticInnerClassSingleton();
    }

}

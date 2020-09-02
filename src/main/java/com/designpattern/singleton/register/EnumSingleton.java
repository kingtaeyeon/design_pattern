package com.designpattern.singleton.register;

/***
 * 枚举式单例
 * @Author: LiHao
 * @Since: 2020/9/2 23:53
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() { return INSTANCE; }
}

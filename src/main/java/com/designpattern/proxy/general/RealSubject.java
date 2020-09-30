package com.designpattern.proxy.general;

public class RealSubject implements ISubject {
    public void request() {
        System.out.println("real service is called");
    }
}

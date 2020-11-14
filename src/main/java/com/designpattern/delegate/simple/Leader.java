package com.designpattern.delegate.simple;

public class Leader implements IEmployee{

    protected String goodAt = "编程";

    public void doing(String task) {

        if("爬虫".equals(task)) {
            new EmployeeA().doing(task);
        } else if("海报图".equals(task)) {
            new EmployeeB().doing(task);
        } else {
            System.out.println(task + "这个任务超出我的能力范围");
        }
    }
}

package com.designpattern.proxy.dbroute.proxy;

import com.designpattern.proxy.dbroute.IOrderService;
import com.designpattern.proxy.dbroute.Order;
import com.designpattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {

        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理自动分配到【DB_"+ dbRouter +"】数据源处理数据");
        DynamicDataSourceEntity.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void before() {
        System.out.println("Proxy before method");
    }

    private void after() {
        System.out.println("Proxy after method");
    }
}

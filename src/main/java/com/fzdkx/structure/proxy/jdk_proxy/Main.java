package com.fzdkx.structure.proxy.jdk_proxy;


/**
 * @author 发着呆看星
 * @create 2024/4/27
 */
public class Main {
    public static void main(String[] args) {
        SellTickets sellTickets = (SellTickets) ProxyFactory.getProxy(new TrainStation());
        sellTickets.sell();

        SellTickets proxy = (SellTickets) ProxyFactory.getProxy(new App());
        proxy.sell();
    }
}

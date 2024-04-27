package com.fzdkx.structure.proxy.jdk_proxy;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 * 火车站：实现卖票接口
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站正在买票......");
    }
}

package com.fzdkx.structure.proxy.static_proxy;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 * 代售点：实现卖票接口
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    public ProxyPoint() {
    }

    @Override
    public void sell() {
        System.out.println("代售点收取服务费用...");
        trainStation.sell();
    }
}

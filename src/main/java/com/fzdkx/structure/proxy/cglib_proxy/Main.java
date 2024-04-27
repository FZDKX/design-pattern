package com.fzdkx.structure.proxy.cglib_proxy;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 */
public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation trainStation = (TrainStation) proxyFactory.getProxy(new TrainStation());
        trainStation.sell();

        App app = (App) proxyFactory.getProxy(new App());
        app.sell();
    }
}

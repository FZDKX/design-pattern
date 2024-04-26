package com.fzdkx.creatation.factory.abstract_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 小米工厂：生产 坦克 和 跑车
 */
public class XiaoMiFactory implements AbstractFactory{

    @Override
    public Car getCar() {
        return new SportsCar();
    }

    @Override
    public Ordnance getOrdnance() {
        return new Tank();
    }
}

package com.fzdkx.creatation.factory.abstract_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 华为工厂：生产 家用汽车 和 手枪
 */
public class HuaWeiFactory implements AbstractFactory{
    @Override
    public Car getCar() {
        return new FamilyCar();
    }

    @Override
    public Ordnance getOrdnance() {
        return new Pistol();
    }
}

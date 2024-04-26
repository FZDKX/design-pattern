package com.fzdkx.creatation.factory.simple_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 */
public class Main {
    public static void main(String[] args) {
        // 获取军火工厂
        // 获取一辆坦克
        Ordnance tank = OrdnanceFactory.getOrdnance(OrdnanceFactory.TANK);
        tank.fire();
        // 获取一把手枪
        Ordnance pistol = OrdnanceFactory.getOrdnance(OrdnanceFactory.PISTOL);
        pistol.fire();
    }
}

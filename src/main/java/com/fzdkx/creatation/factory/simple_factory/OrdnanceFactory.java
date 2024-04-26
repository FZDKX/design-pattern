package com.fzdkx.creatation.factory.simple_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 军火工厂
 */
public class OrdnanceFactory {
    public static final String TANK = "tank";
    public static final String PISTOL = "pistol";
    public static Ordnance getOrdnance(String name) {
        if (TANK.equals(name)) {
            return new Tank();
        } else if (PISTOL.equals(name)) {
            return new Pistol();
        } else {
            throw  new RuntimeException("暂时不能生产该产品");
        }
    }
}

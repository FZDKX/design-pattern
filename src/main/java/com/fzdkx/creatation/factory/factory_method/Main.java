package com.fzdkx.creatation.factory.factory_method;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 */
public class Main {
    public static void main(String[] args) {

        TankFactory tankFactory = new TankFactory();
        Ordnance tank = tankFactory.getOrdnance();
        tank.fire();

        PistolFactory pistolFactory = new PistolFactory();
        Ordnance pistol = pistolFactory.getOrdnance();
        pistol.fire();
    }
}

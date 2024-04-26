package com.fzdkx.creatation.factory.abstract_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 */
public class Main {
    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Car huaweiCar = huaWeiFactory.getCar();
        huaweiCar.run();
        Ordnance huaweiOrdnance = huaWeiFactory.getOrdnance();
        huaweiOrdnance.fire();

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        Car xiaomiCar = xiaoMiFactory.getCar();
        xiaomiCar.run();
        Ordnance xiaomiOrdnance = xiaoMiFactory.getOrdnance();
        xiaomiOrdnance.fire();
    }
}

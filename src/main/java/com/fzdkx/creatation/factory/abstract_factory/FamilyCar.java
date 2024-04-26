package com.fzdkx.creatation.factory.abstract_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 具体产品：家用车
 */
public class FamilyCar implements Car{

    @Override
    public void run() {
        System.out.println("家用车 哒哒哒.....");
    }
}

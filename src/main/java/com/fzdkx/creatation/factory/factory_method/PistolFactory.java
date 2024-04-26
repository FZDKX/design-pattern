package com.fzdkx.creatation.factory.factory_method;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 */
public class PistolFactory implements OrdnanceFactory{
    @Override
    public Ordnance getOrdnance() {
        return new Pistol();
    }
}

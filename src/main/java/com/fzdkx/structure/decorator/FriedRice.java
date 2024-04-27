package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class FriedRice extends FastFoot {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}

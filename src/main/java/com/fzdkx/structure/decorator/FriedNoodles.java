package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class FriedNoodles extends FastFoot{
    public FriedNoodles() {
        super(8, "炒面");
    }

    @Override
    public double cost() {
        return getPrice();
    }
}

package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Bacon extends Garnish{
    public Bacon(FastFoot fastFoot) {
        super(3, "培根", fastFoot);
    }

    // 当前快餐价格为：当前小料价格 + 与之前快餐价格
    @Override
    public double cost() {
        return getPrice() + getFastFoot().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFoot().getDesc();
    }
}

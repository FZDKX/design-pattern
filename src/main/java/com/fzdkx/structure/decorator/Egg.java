package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 具体装饰：鸡蛋
 */
public class Egg extends Garnish{
    public Egg(FastFoot fastFoot) {
        super(2, "鸡蛋", fastFoot);
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

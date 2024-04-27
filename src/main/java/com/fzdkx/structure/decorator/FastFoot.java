package com.fzdkx.structure.decorator;

import lombok.Data;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 抽象构建：主体
 */
@Data
public abstract class FastFoot {

    private double price;

    private String desc;

    public FastFoot(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    // 抽象方法：获取当前快餐总价格
    public abstract double cost();
}

package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 抽象装饰：继承抽象构建，持有抽象构建
 */

public abstract class Garnish extends FastFoot{

    // 持有抽象构建
    private FastFoot fastFoot;

    public Garnish(double price, String desc, FastFoot fastFoot) {
        super(price, desc);
        this.fastFoot = fastFoot;
    }

    public FastFoot getFastFoot() {
        return fastFoot;
    }

    public void setFastFoot(FastFoot fastFoot) {
        this.fastFoot = fastFoot;
    }

}

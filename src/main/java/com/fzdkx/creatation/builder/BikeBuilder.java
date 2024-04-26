package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public abstract class BikeBuilder {
    protected Bike bike;

    public BikeBuilder() {
        this.bike = new Bike();
    }

    public abstract void builderSkeleton();

    public abstract void builderSaddle();

    public Bike getProduct() {
        return bike;
    }
}

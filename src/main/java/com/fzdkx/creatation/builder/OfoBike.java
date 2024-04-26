package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class OfoBike extends BikeBuilder {
    @Override
    public void builderSkeleton() {
        bike.setSkeleton("铝合金骨架");
    }

    @Override
    public void builderSaddle() {
        bike.setSaddle("真皮座椅");
    }
}

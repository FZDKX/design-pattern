package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class MoBileBike extends BikeBuilder {
    @Override
    public void builderSkeleton() {
        bike.setSkeleton("不锈钢骨架");
    }

    @Override
    public void builderSaddle() {
        bike.setSaddle("塑料座椅");
    }
}

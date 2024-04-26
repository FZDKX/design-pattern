package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Director {
    private BikeBuilder builder;

    public Director(BikeBuilder builder){
        this.builder = builder;
    }

    // 根据Builder，按照固定步骤，构建不同自行车
    public Bike createBike(){
        builder.builderSkeleton();
        builder.builderSaddle();
        return builder.getProduct();
    }
}

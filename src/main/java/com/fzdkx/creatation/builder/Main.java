package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new MoBileBike());
        Bike bike = director.createBike();
        System.out.println(bike);

        director = new Director(new OfoBike());
        bike = director.createBike();
        System.out.println(bike);
    }
}

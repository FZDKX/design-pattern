package com.fzdkx.creatation.builder;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 复杂对象：自行车
 */
public class Bike {
    private String skeleton;
    private String saddle;

    public String getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public String getSaddle() {
        return saddle;
    }

    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "skeleton='" + skeleton + '\'' +
                ", saddle='" + saddle + '\'' +
                '}';
    }
}

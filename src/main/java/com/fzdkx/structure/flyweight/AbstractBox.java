package com.fzdkx.structure.flyweight;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 * 抽象享元角色：盒子
 */
public abstract class AbstractBox {

    // 获取图形
    public abstract String getShape();

    // 画
    public void display(String color){
        System.out.println("图形形状：" + getShape() + " 颜色：" + color);
    }

}

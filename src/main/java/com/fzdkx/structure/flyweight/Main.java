package com.fzdkx.structure.flyweight;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 */
public class Main {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getBox("I");
        AbstractBox o = instance.getBox("O");
        AbstractBox s = instance.getBox("S");
        i.display("红色");
        i.getShape();

        i.display("蓝色");
        i.getShape();
    }
}

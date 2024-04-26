package com.fzdkx.creatation.factory.simple_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 */
public class Tank implements Ordnance{
    private final String name = "坦克";

    @Override
    public void fire(){
        System.out.println(name + " bong bong bong 向鬼子开炮");
    }
}

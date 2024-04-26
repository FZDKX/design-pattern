package com.fzdkx.creatation.factory.factory_method;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 手枪
 */
public class Pistol implements Ordnance {
    private final String name = "手枪";

    @Override
    public void fire(){
        System.out.println(name + " biu biu biu 打向鬼子");
    }
}

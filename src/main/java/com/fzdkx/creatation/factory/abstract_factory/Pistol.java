package com.fzdkx.creatation.factory.abstract_factory;

/**
 * @author 发着呆看星
 * @create 2024/4/25
 * 具体产品：手枪
 */
public class Pistol implements Ordnance {
    private final String name = "手枪";

    @Override
    public void fire(){
        System.out.println(name + " biu biu biu 打向鬼子");
    }
}

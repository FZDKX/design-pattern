package com.fzdkx.structure.facade;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 */
public class Main {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        smartAppliancesFacade.say("关闭家电");
    }
}

package com.fzdkx.structure.facade;

import lombok.Data;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 * 智能音箱类：外观角色
 */
@Data
public class SmartAppliancesFacade {
    // 持有子系统类对象
    private TV tv;
    private Light light;
    private AirConditioner airConditioner;

    public SmartAppliancesFacade() {
        this.tv = new TV();
        this.airConditioner = new AirConditioner();
        this.light = new Light();
    }

    // 打开 电视，空调，电灯
    private void on(){
        System.out.println("起床了....");
        light.on();
        airConditioner.on();
        tv.on();
    }

    // 关闭 电视，空调，电灯
    private void off(){
        System.out.println("睡觉了....");
        tv.off();
        airConditioner.off();
        light.off();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else {
            System.out.println("正在学习该功能，目前不能使用");
        }
    }
}

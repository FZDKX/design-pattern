package com.fzdkx.structure.adapter.clazz;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 电脑类：只能读取目标接口
 */
public class Computer {

    // 只能读取SD卡
    public void readSD(SDCard sd) {
        if (sd == null) {
            throw new RuntimeException("SD卡不能为空");
        }
        System.out.println(sd.readSD());
    }

    // 写SD卡
    public void writeSD(SDCard sd, String message) {
        if (sd == null) {
            throw new RuntimeException("SD卡不能为空");
        }
        sd.writeSD(message);
    }
}

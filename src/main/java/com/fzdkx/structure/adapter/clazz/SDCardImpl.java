package com.fzdkx.structure.adapter.clazz;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * SDCard实现类：目标接口
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "正在读取 sd card ， hello sd card";
    }

    @Override
    public void writeSD(String data) {
        System.out.println("正在向 sd card 中写入数据：" + data);
    }
}

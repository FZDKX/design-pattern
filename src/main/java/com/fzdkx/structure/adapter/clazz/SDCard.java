package com.fzdkx.structure.adapter.clazz;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * SD卡接口：目标接口
 */
public interface SDCard {
    String readSD();
    void writeSD(String data);
}

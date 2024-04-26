package com.fzdkx.structure.adapter;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * TF Card 接口：适配者
 */
public interface TFCard {
    String readTF();

    void writeTF(String message);
}

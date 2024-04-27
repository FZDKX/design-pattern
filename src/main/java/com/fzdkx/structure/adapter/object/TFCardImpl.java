package com.fzdkx.structure.adapter.object;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * 适配者
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "正在读取 tf card ， hello tf card";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("正在向 tf card 中写入数据：" + data);
    }
}

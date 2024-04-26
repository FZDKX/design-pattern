package com.fzdkx.structure.adapter;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * SD卡适配器：承上启下，需要实现目标接口 ，继承或引用适配者
 */
public class SDCardAdapter extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("适配器读取 tf card");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配者写入 tf card");
        writeTF(data);
    }
}

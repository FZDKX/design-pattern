package com.fzdkx.structure.adapter.object;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 * SD卡适配器：承上启下，需要实现目标接口 ，继承或引用适配者
 */
public class SDCardAdapter implements SDCard {
    private TFCard tfCard;

    public SDCardAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器读取 tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("适配者写入 tf card");
        tfCard.writeTF(data);
    }
}

package com.fzdkx.structure.adapter;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Main {
    public static void main(String[] args) {
        // 使用 Compute 读取 TF Card
        Computer computer = new Computer();
        // 传入 Adapter 代替 目标接口
        computer.readSD(new SDCardAdapter());
    }
}

package com.fzdkx.structure.bridge;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac(new AviFile());
        mac.play("赛德克巴莱");

        Windows windows = new Windows(new MkvFile());
        windows.play("深海");
    }
}

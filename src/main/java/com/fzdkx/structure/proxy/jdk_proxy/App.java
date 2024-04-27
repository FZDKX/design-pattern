package com.fzdkx.structure.proxy.jdk_proxy;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 */
public class App implements SellTickets{
    @Override
    public void sell() {
        System.out.println("正在进行线上卖票");
    }
}

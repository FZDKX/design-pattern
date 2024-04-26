package com.fzdkx.creatation.builder.extend;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙999")
                .camera("三星4K")
                .screen("索尼")
                .memory("512G")
                .build();
        System.out.println(phone);
    }
}

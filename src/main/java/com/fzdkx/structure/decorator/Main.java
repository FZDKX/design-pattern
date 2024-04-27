package com.fzdkx.structure.decorator;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Main {
    public static void main(String[] args) {
        // 点一份炒饭
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " " + friedRice.cost());
        // 加2个鸡蛋
        // 加第一个
        Egg egg = new Egg(friedRice);
        System.out.println(egg.getDesc() + " " + egg.cost());
        // 加第二个
        Egg egg1 = new Egg(egg);
        System.out.println(egg1.getDesc() + " " + egg1.cost());
        // 再加一个培根
        Bacon bacon = new Bacon(egg1);
        System.out.println(bacon.getDesc() + " " + bacon.cost());
    }
}

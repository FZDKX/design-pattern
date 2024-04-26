package com.fzdkx.creatation.prototype;

/**
 * @author 发着呆看星
 * @create 2024/4/24
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 从数据库中获取
        User user = MyBatis.getUser("发着呆看星");
        System.out.println(user);
        // 修改属性
        user.setName("陈平安");
        user.setAge(22);
        System.out.println(user);


        User user1 = MyBatis.getUser("发着呆看星");
        System.out.println(user1);
        User user2 = MyBatis.getUser("发着呆看星");
        System.out.println(user2);
        User user3 = MyBatis.getUser("发着呆看星");
        System.out.println(user3);
    }
}

package com.fzdkx.creatation.singleton;

/**
 * @author 发着呆看星
 * @create 2024/4/24
 */
public class Person {

    // 懒汉式
    private static volatile Person instance;

    // 饿汉式
    private static final Person person = new Person();

    // 构造器使用，使外部不能实例化
    private Person() {

    }

    // 懒汉式：提供给外部的方法，获取实例
    // 为了减少锁的粒度，使用双重检查锁 + volatile
    public static Person getInstance() {
        // 如果系统中没有实例，那么就创建
        // 双重检查锁
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null){
                    instance = new Person();
                }
            }
        }
        return instance;
    }

    // 饿汉式
    public static Person getPerson() {
        return person;
    }
}

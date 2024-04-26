package com.fzdkx.creatation.prototype;

/**
 * @author 发着呆看星
 * @create 2024/4/24
 */
public class User implements Cloneable {
    private String name;
    private Integer age;

    @Override
    // 浅克隆
    public User clone(){
        User user = null;
        try {
            user = (User) super.clone();
            // 深克隆，需要对引用类型，进行递归克隆
            // user.set(a.clone())
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

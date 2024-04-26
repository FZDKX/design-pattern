package com.fzdkx.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 发着呆看星
 * @create 2024/4/24
 */
public class MyBatis {
    // user cache
    private static final Map<String, User> cache = new HashMap<>();

    // 从数据库中查询User
    public static User getUser(String name) {
        // 判断缓存中是否存在
        // 存在，从缓存中获取源对象，进行clone
        if (cache.containsKey(name)) {
            User user = cache.get(name);
            user = user.clone();
            return user;
        }
        // 不存在，从数据库中查询
        else {
            // 数据库查询
            System.out.println("从数据库中查询到用户：" + name);
            User user = new User();
            user.setName(name);
            user.setAge(20);
            // 存入缓存
            cache.put(name, user);
            // 将clone对象返回，避免脏缓存
            return user.clone();
        }
    }
}

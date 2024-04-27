package com.fzdkx.structure.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 * 代理工厂：用于生产代理类
 */
public class ProxyFactory {

    // 动态获取代理类
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 进行增强
                    System.out.println("代售点收取服务费用...");
                    // 调用目标类方法，并返回目标方法返回值
                    return method.invoke(target, args);
                }
        );
    }
}

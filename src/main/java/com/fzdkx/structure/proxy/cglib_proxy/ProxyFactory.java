package com.fzdkx.structure.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 发着呆看星
 * @create 2024/4/27
 */
public class ProxyFactory implements MethodInterceptor {

    public Object getProxy(Object target){
        // 创建增强器对象
        Enhancer enhancer = new Enhancer();
        // 设置父类 --> target
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数类对象 --> this
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取手续费用...");
        // 使用super ，调用父类对象
        return methodProxy.invokeSuper(proxy,args);
    }
}

package com.fzdkx.structure.flyweight;

import java.util.HashMap;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 * 方块工厂：使用单例模式
 */
public class BoxFactory {
    private final HashMap<String, AbstractBox> cache;
    private static volatile BoxFactory boxFactory;

    private BoxFactory() {
        cache = new HashMap<>();
        cache.put("I",new IBox());
        cache.put("S",new SBox());
        cache.put("T",new TBox());
    }

    public static BoxFactory getInstance() {
        if (boxFactory == null){
            synchronized (BoxFactory.class){
                if (boxFactory == null){
                    boxFactory = new BoxFactory();
                }
            }
        }
        return boxFactory;
    }

    public AbstractBox getBox(String key) {
        return cache.get(key);
    }
}

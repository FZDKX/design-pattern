package com.fzdkx.structure.composite;

import lombok.Data;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 * 抽象根节点
 */
@Data
public abstract class MenuComponent {
    // 名称
    protected String name;
    // 层级
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // 添加 子菜单，子菜单项
    public void add(MenuComponent component){
        throw new RuntimeException("不正确的操作");
    }

    // 删除 指定 子菜单，子菜单项
    public void remove(MenuComponent component){
        throw new RuntimeException("不正确的操作");
    }

    // 获取 指定 子菜单，子菜单项
    public MenuComponent get(int index){
        throw new RuntimeException("不正确的操作");
    }

    // 获取 当前 菜单，菜单项 名称
    public String getName(){
        return name;
    }

    // 遍历 当前 子菜单，子菜单项
    public abstract void print();
}

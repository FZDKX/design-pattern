package com.fzdkx.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 */
public class Menu extends MenuComponent {

    private final List<MenuComponent> list = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent component) {
        // 添加到集合
        list.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public MenuComponent get(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println("|-" + getName());
        for (MenuComponent menuComponent : list) {
           menuComponent.print();
        }
    }
}

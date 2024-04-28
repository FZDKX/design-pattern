package com.fzdkx.structure.composite;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println("|-" + getName());
    }
}

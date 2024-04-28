package com.fzdkx.structure.composite;

/**
 * @author 发着呆看星
 * @create 2024/4/28
 */
public class Main {
    public static void main(String[] args) {
        Menu menu0 = new Menu("系统管理", 1);
        Menu menu1 = new Menu("菜单管理", 2);
        Menu menu2 = new Menu("权限管理", 2);
        Menu menu3 = new Menu("角色管理", 2);

        MenuItem item1 = new MenuItem("页面访问", 3);
        MenuItem item2 = new MenuItem("展开菜单", 3);
        MenuItem item3 = new MenuItem("编辑菜单", 3);
        MenuItem item4 = new MenuItem("删除菜单", 3);
        MenuItem item5 = new MenuItem("新增菜单", 3);
        MenuItem item6 = new MenuItem("页面访问", 3);
        MenuItem item7 = new MenuItem("提交保存", 3);
        MenuItem item8 = new MenuItem("页面访问", 3);
        MenuItem item9 = new MenuItem("新增角色", 3);
        MenuItem item10 = new MenuItem("修改角色", 3);

        menu0.add(menu1);
        menu0.add(menu2);
        menu0.add(menu3);

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu2.add(item6);
        menu2.add(item7);
        menu3.add(item8);
        menu3.add(item9);
        menu3.add(item10);
        menu0.print();
    }
}

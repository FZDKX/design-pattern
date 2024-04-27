package com.fzdkx.structure.bridge;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class MkvFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        java.lang.System.out.println("正在对mkv文件：" + fileName + " 解码");
    }
}

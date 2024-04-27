package com.fzdkx.structure.bridge;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("正在对avi文件：" + fileName + " 解码");
    }
}

package com.fzdkx.structure.bridge;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Mac extends MySystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("正在播放：" + fileName);
        videoFile.decode(fileName);
    }
}

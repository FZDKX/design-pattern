package com.fzdkx.structure.bridge;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public abstract class MySystem {
    protected VideoFile videoFile;

    public MySystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}

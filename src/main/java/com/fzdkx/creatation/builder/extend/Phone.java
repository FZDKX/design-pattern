package com.fzdkx.creatation.builder.extend;

/**
 * @author 发着呆看星
 * @create 2024/4/26
 */
public class Phone {
    private String cpu;
    private String screen;
    private String camera;
    private String memory;

    // 构造器私有化(也可以不私有)
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.memory = builder.memory;
    }


    public static class Builder {
        private String cpu;
        private String screen;
        private String camera;
        private String memory;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder camera(String camera){
            this.camera = camera;
            return this;
        }
        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}

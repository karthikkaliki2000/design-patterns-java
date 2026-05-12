package com.design.patterns.structural.bridge;

public abstract class Video {

    protected VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor){
        this.videoProcessor=videoProcessor;
    }
    abstract void play(String videoName);
}

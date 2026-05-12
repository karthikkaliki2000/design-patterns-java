package com.design.patterns.structural.bridge;

public class NetflixVideo extends Video{

    public NetflixVideo(VideoProcessor videoProcessor){
        super(videoProcessor);
    }
    @Override
    void play(String videoName) {
        System.out.println("Netflix Video ->");
        videoProcessor.process(videoName);

    }
}

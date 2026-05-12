package com.design.patterns.structural.bridge;

public class YoutubeVideo extends Video{

    public YoutubeVideo(VideoProcessor videoProcessor){
        super(videoProcessor);
    }
    @Override
    void play(String videoName) {
        System.out.println("Youtube Video ->");
        videoProcessor.process(videoName);

    }
}

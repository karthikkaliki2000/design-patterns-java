package com.design.patterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Video youtubeHD=new YoutubeVideo(new HDProcessor());
        youtubeHD.play("Java Bridge Design Pattern");

        Video netflix4K=new NetflixVideo(new UHD4KProcessor());
        netflix4K.play("Movie Night");


    }
}

package com.design.patterns.structural.bridge;

public class UHD4KProcessor implements VideoProcessor{

    @Override
    public void process(String videoName) {
        System.out.println(videoName+" Playing in UHD 4K quality");
    }
}

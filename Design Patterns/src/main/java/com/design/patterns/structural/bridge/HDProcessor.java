package com.design.patterns.structural.bridge;

public class HDProcessor implements VideoProcessor{

    @Override
    public void process(String videoName) {
        System.out.println(videoName+" Playing in HD quality");
    }
}

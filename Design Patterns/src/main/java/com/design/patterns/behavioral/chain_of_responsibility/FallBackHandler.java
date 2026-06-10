package com.design.patterns.behavioral.chain_of_responsibility;

public class FallBackHandler extends Handler{
    @Override
    public void handle(String request) {
        System.out.println("Something went wrong:"+request);

    }
}

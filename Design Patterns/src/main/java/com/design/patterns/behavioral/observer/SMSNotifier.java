package com.design.patterns.behavioral.observer;

public class SMSNotifier implements Observer{
    @Override
    public void update(String message) {
        System.out.println("SMS sent: "+message);
    }
}

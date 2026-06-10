package com.design.patterns.behavioral.state;

public class NewOrderState implements OrderState{
    @Override
    public void handle() {
        System.out.println("New Order Cretaed: Awaiting payment");
    }
}

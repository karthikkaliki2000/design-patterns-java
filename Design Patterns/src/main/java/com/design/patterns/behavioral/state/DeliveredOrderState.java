package com.design.patterns.behavioral.state;

public class DeliveredOrderState implements OrderState{
    @Override
    public void handle() {
        System.out.println("Your Order Delivered Successfully");
    }
}

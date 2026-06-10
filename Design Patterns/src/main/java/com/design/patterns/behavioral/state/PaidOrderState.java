package com.design.patterns.behavioral.state;

public class PaidOrderState implements OrderState{
    @Override
    public void handle() {
        System.out.println("Payment received: Processing Shipment");
    }
}

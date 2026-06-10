package com.design.patterns.behavioral.state;

public class ShippedOrderState implements OrderState{
    @Override
    public void handle() {
        System.out.println("Shipment Done: Out for Delivery");
    }
}

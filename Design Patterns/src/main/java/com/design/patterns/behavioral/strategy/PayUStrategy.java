package com.design.patterns.behavioral.strategy;

public class PayUStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment done through PayU with amount : "+ amount);
    }
}

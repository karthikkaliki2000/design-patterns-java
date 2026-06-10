package com.design.patterns.behavioral.strategy;

public class JuspayStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment done through Juspay with amount : "+ amount);
    }
}

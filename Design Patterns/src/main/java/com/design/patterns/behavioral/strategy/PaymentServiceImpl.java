package com.design.patterns.behavioral.strategy;

public class PaymentServiceImpl implements PaymentService{

    private PaymentStrategy paymentStrategy;

    public PaymentServiceImpl(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    @Override
    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

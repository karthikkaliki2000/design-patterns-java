package com.design.patterns.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentServiceImpl(new JuspayStrategy());
        paymentService.checkout(200);

        //at runtime, we can shift or change strategies without changing its main context

        PaymentService paymentService2=new PaymentServiceImpl(new PayUStrategy());
        paymentService2.checkout(300);
    }
}

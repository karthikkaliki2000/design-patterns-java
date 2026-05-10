package com.design.patterns.structural.adaptor;

public class AdaptorMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PayementAdaptor(new OldPayementGateway());

        paymentProcessor.pay(500);
    }
}

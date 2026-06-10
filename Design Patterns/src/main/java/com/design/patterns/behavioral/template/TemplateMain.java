package com.design.patterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        PaymentProcessor cardPaymentProcessor=new CardPayment();
        //template method defining the fixed workflows
        cardPaymentProcessor.processPayment();

        PaymentProcessor upiPaymentProcessor=new UPIPayment();

        upiPaymentProcessor.processPayment();
    }
}

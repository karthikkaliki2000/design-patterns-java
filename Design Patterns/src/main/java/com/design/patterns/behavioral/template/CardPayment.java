package com.design.patterns.behavioral.template;

public class CardPayment extends PaymentProcessor{
    @Override
    protected void authenticate() {
        System.out.println("Card Authenticated");
    }

    @Override
    protected void validate() {
        System.out.println("Card Validated");
    }

    @Override
    protected void execute() {
        System.out.println("Card Payment done");
    }
}

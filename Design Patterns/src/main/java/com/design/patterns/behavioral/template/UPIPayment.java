package com.design.patterns.behavioral.template;

public class UPIPayment extends PaymentProcessor{
    @Override
    protected void authenticate() {
        System.out.println("UPI Authenticated");
    }

    @Override
    protected void validate() {
        System.out.println("UPI Validated");
    }

    @Override
    protected void execute() {
        System.out.println("UPI Payment done");
    }
}

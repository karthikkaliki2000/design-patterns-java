package com.design.patterns.structural.adaptor;

public class PayementAdaptor implements PaymentProcessor{

    private OldPayementGateway oldPayementGateway;

    public PayementAdaptor(OldPayementGateway oldPayementGateway){
        this.oldPayementGateway=oldPayementGateway;
    }
    @Override
    public void pay(int amount) {
            oldPayementGateway.makePayment(String.valueOf(amount));//client uses modern interface
    }
}

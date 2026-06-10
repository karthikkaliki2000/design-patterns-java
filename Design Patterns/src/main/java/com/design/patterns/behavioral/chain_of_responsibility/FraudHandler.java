package com.design.patterns.behavioral.chain_of_responsibility;

public class FraudHandler extends Handler{
    @Override
    public void handle(String request) {
        if(request.equalsIgnoreCase("fraud")){
            System.out.println("Fraud check successful further payment is processing is there");
            Handler paymentHandler=new PaymentHandler();
            this.setNext(paymentHandler);
            this.next.handle("payment");
        }
        else{
            Handler fallBackHandler=new FallBackHandler();
            fallBackHandler.handle("Fraud check failed");
        }

    }
}

package com.design.patterns.behavioral.chain_of_responsibility;

public class PaymentHandler extends Handler{
    @Override
    public void handle(String request) {
        if(request.equalsIgnoreCase("payment")){
            System.out.println("Payment processed successful ");
        }
        else{
            Handler fallBackHandler=new FallBackHandler();
            fallBackHandler.handle("payment failed");
        }

    }
}

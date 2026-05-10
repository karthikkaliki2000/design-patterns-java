package com.design.patterns.structural.adaptor;

public class OldPayementGateway {

    public void makePayment(String amount){
        System.out.println("Payment processed of amount: "+amount+" Sucessfully");
    }
}

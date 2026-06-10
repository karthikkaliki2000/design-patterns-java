package com.design.patterns.behavioral.template;

public abstract class PaymentProcessor {
    public final void processPayment(){
         authenticate();
         validate();
         execute();
         receipt();
    }

    //subclasses override these methods for customising their own but  flow of steps is same for all subclasses
    protected abstract void authenticate();

    protected abstract void validate();

    protected abstract void execute();

    //common method
    protected void receipt(){
        System.out.println("Receipt generated");
    }


}

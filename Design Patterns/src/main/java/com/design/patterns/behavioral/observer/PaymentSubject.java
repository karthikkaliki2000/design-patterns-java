package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//publisher
public class PaymentSubject {

    private List<Observer> observers=new ArrayList<>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyAllObservers(String message){
        for(Observer o:observers){
            o.update(message);
        }
    }

    protected void paymentProcess(double amount){
        System.out.println("Notifying.....");
        boolean isPaymentDone=true;

        if(isPaymentDone){
            this.notifyAllObservers("Payment successfull of amount : "+amount);
        }
        else{
            this.notifyAllObservers("Payment failed of amount : "+amount);
        }

    }

}

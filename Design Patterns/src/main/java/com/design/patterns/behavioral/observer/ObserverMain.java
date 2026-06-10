package com.design.patterns.behavioral.observer;


public class ObserverMain {
    public static void main(String[] args) {
        PaymentSubject paymentSubject=new PaymentSubject();
        paymentSubject.addObserver(new EmailNotifier());
        paymentSubject.addObserver(new SMSNotifier());
        paymentSubject.paymentProcess(200);

    }
}

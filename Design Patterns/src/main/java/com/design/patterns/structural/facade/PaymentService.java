package com.design.patterns.structural.facade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaymentService {

    private double balance=1000;


    public String checkBalance(){
        return "Payement Service enabled Successfully and available balance is "+balance;

    }
}

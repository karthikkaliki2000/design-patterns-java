package com.design.patterns.structural.proxy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RealBankAccount implements BankAccount{

    private double balance=1000;
    @Override
    public void withdraw(double amount) {

        if(balance>=amount){
            balance-=amount;
            String formattedDate = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

            System.out.println("Amount of " + amount + " debited successfully at " + formattedDate);

        }
        else{
            System.out.println("Insufficient balance "+balance);
        }

    }
}

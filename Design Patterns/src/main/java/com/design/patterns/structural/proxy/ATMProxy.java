package com.design.patterns.structural.proxy;

import org.w3c.dom.ranges.RangeException;

public class ATMProxy implements BankAccount{

    RealBankAccount realBankAccount;
     public ATMProxy(RealBankAccount realBankAccount){
         this.realBankAccount=realBankAccount;
     }

    @Override
    public void withdraw(double amount) {
        System.out.println("Authenticating the user...");
        realBankAccount.withdraw(amount);
    }
}

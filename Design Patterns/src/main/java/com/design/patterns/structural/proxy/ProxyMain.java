package com.design.patterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {


        BankAccount atm=new ATMProxy(new RealBankAccount());//atm proxy control access to the real subject here in our case RealBankAccount
        atm.withdraw(800);
        atm.withdraw(700);
    }
}

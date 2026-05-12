package com.design.patterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        BankFacade bank=new BankFacade();
        bank.openAccount("Karthik");//there is only one simple method for client to open account instead of creating all subsystems here


    }
}

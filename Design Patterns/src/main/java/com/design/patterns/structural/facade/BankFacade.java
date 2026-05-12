package com.design.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class BankFacade {//acts a staeless because it wont store the history or other accounts info
    private AccountService accountService;
    private LoanService loanService;
    private PaymentService paymentService;

    private List<String> accounts=new ArrayList();///acts a s db for storing user info for each account creation

    public BankFacade(){
        this.accountService=new AccountService();
        this.loanService=new LoanService();
        this.paymentService=new PaymentService();

    }

    public void openAccount(String name){

        accountService.createAccount(name);
        loanService.loanApprove(name);

        paymentService.checkBalance();

        accounts.add(name);//stores into db
    }
}

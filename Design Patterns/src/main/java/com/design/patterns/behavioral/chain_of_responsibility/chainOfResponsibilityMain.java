package com.design.patterns.behavioral.chain_of_responsibility;

public class chainOfResponsibilityMain {
    public static void main(String[] args) {
        Handler authHandler=new AuthenticationHandler();
        authHandler.handle("auth");

        authHandler.handle("wrong");
    }
}

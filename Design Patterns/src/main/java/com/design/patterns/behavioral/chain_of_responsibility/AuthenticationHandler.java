package com.design.patterns.behavioral.chain_of_responsibility;

public class AuthenticationHandler extends Handler{
    @Override
    public void handle(String request) {
        if(request.equalsIgnoreCase("auth")){
            System.out.println("Authentication successful further fraud check is there");
            Handler fraudHandler=new FraudHandler();
            this.setNext(fraudHandler);
            this.next.handle("fraud");
        }
        else{
            Handler fallBackHandler=new FallBackHandler();
            fallBackHandler.handle("Authentication failed");
        }

    }
}

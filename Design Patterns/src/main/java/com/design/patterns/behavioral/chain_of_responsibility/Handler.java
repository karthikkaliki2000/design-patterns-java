package com.design.patterns.behavioral.chain_of_responsibility;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next){
        this.next=next;
    }

    public abstract void handle(String request);
}

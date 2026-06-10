package com.design.patterns.behavioral.state;

public class OrderContext {
    private OrderState orderState;

    public void setState(OrderState orderState){
        this.orderState=orderState;
    }

    public void process(){
        this.orderState.handle();
    }
}

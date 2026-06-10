package com.design.patterns.behavioral.state;

public class StateMain {
    public static void main(String[] args) {
        OrderContext ecommerceOrder=new OrderContext();
        ecommerceOrder.setState(new NewOrderState());
        ecommerceOrder.process();

        ecommerceOrder.setState(new PaidOrderState());
        ecommerceOrder.process();

        ecommerceOrder.setState(new ShippedOrderState());
        ecommerceOrder.process();

        ecommerceOrder.setState(new DeliveredOrderState());
        ecommerceOrder.process();

        //state is changing for same object and accordingly that object behavior changing
    }
}

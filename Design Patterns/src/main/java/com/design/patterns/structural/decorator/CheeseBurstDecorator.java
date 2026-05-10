package com.design.patterns.structural.decorator;

public class CheeseBurstDecorator extends PizzaDecorator {
    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
        return pizza.bake()+addCheseBurst();
    }

    public String addCheseBurst(){
        return "Cheese Burst Added ";
    }
}

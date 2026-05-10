package com.design.patterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza=new BasePizza();

        Pizza jalepanoPizza=new JalepanoDecorator(pizza);

        Pizza cheeseBurstPizza=new CheeseBurstDecorator(jalepanoPizza);

        System.out.println(cheeseBurstPizza.bake());
    }
}

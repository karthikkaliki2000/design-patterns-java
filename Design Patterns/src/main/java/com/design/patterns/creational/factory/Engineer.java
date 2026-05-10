package com.design.patterns.creational.factory;

public class Engineer implements Profession{

    



    @Override
    public void work() {
        System.out.println("Working as Engineer and salary is "+200000);
    }

    @Override
    public void display(){

        System.out.println("Factor Design Pattern: It is way of creating objects without exposing the creation logic and by using common factory method to decide which object to create");
    }
}

package com.design.patterns.creational.factory;

public class Doctor implements Profession{





    @Override
    public void work() {
        System.out.println("Working as doctor and salary is "+100000);
    }

    @Override
    public void display(){

        System.out.println("Factor Design Pattern: It is way of creating objects without exposing the creation logic and by using common factory method to decide which object to create");
    }
}

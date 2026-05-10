package com.design.patterns.creational.factory;

public interface Profession {
    



    void work();
    default void display(){
        System.out.println("Factor Design Pattern: It is way of creating objects without exposing the creation logic and by using common factory method to decide which object to create");
    }
}

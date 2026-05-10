package com.design.patterns.creational.abstract_factory;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("I am Experienced Teacher");
    }
}

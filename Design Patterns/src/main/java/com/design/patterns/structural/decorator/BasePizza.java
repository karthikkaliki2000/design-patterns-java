package com.design.patterns.structural.decorator;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base Pizza with ";
    }
}

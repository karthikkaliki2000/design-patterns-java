package com.design.patterns.structural.flyweight;

public class Pen {

    private final String color;  //Intrinsic State: Common and immutable

    public Pen(String color) {
        this.color = color;
    }

    public void writingUser(String user){   //Extrinsic state: Unique for specific context
        System.out.println("Writing by the user "+user+" with the pen color "+color);
    }
}

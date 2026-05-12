package com.design.patterns.structural.flyweight;

public class FlyWeightMain {
    public static void main(String[] args) {
        PenFactory penFactory=new PenFactory();
        Pen bluepen1=penFactory.getPen("blue");
        bluepen1.writingUser("Karthik");

        Pen bluepen2=penFactory.getPen("blue");
        bluepen1.writingUser("Ram");

        Pen bluepen3=penFactory.getPen("blue");
        bluepen1.writingUser("Satvik");

        Pen redPen=penFactory.getPen("red");
        redPen.writingUser("Lokesh");
        //instead of creating a new pen every time,
        // you reuse the same pen object for the same color.
        //so we can reduce the memory usage bu sahring the intrinsic state among the objects





    }
}

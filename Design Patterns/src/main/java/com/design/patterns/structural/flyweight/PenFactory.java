package com.design.patterns.structural.flyweight;

import java.util.HashMap;

public class PenFactory {
     private HashMap<String,Pen> pensBox=new HashMap<>();

//instead of creating a new pen every time, you reuse the same pen object for the same color.

     public Pen getPen(String color){
         pensBox.putIfAbsent(color,new Pen(color));
         return pensBox.get(color);

     }
}

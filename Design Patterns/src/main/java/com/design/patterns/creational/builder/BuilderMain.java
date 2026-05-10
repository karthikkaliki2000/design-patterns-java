package com.design.patterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Phone phone=new PhoneBuilder()
                .setName("IQOO Z10")
                .setBattery(7300)
                .setMemory(256)
                .setOs("Android")
                .getPhone();

        System.out.println("Building a complex object using step by step approach is called builder pattern");
        System.out.println(phone);
    }
}

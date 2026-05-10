package com.design.patterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args){
        //here main acts as client so client dont know about creational logic
        // and only have factor method to decide which object to create
        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession doctor=professionFactory.getProfession("doctor");
        doctor.display();
        doctor.work();

        Profession engineer=professionFactory.getProfession("engineer");
        engineer.display();
        engineer.work();

        Profession teacher=professionFactory.getProfession("teacher");
        teacher.display();
        teacher.work();

    }
}

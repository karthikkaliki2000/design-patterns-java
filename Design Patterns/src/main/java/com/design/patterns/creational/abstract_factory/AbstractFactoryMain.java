package com.design.patterns.creational.abstract_factory;

public class AbstractFactoryMain {
    public static void main(String[] args){
            AbstractFactory traineeFactory=AbstractFactoryProducer.getFactory("trainee");
            Profession teacher=traineeFactory.getProfession("Teacher");
            teacher.print();

            AbstractFactory experiencedFactory=AbstractFactoryProducer.getFactory("experienced");
            Profession engineer=experiencedFactory.getProfession("Engineer");
            engineer.print();
        


    }
}

package com.design.patterns.creational.abstract_factory;

public class AbstractFactoryProducer {

    public static AbstractFactory getFactory(String typeOfFactory){
        if(typeOfFactory==null){
            return null;
        } else if (typeOfFactory.equalsIgnoreCase("trainee")) {
            return new TraineeProfessionAbstractFactory();
        } else if (typeOfFactory.equalsIgnoreCase("experienced")) {
            return new ExperiencedProfessionAbstractFactory();
        }
        else {
            return null;
        }
    }
}

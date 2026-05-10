package com.design.patterns.creational.abstract_factory;

public class ExperiencedProfessionAbstractFactory extends AbstractFactory{


    @Override
    Profession getProfession(String professionType) {
        if(professionType==null){
            return null;
        }
        else if (professionType.equalsIgnoreCase("engineer")){
            return new Engineer();
        }
        else if (professionType.equalsIgnoreCase("teacher")){
            return new Teacher();
        }
        else {
            return null;
        }
    }
}

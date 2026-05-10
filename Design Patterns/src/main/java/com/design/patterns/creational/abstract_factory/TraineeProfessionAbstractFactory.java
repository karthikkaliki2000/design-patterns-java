package com.design.patterns.creational.abstract_factory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{


    @Override
    Profession getProfession(String professionType) {
        if(professionType==null){
            return null;
        }
        else if (professionType.equalsIgnoreCase("engineer")){
            return new TraineeEngineer();
        }
        else if (professionType.equalsIgnoreCase("teacher")){
            return new TraineeTeacher();
        }
        else {
            return null;
        }
    }
}

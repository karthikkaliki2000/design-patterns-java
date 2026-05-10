package com.design.patterns.creational.factory;

public class ProfessionFactory {
  public Profession getProfession(String professionType){
      if(professionType==null){
          return null;
      } else if (professionType.equalsIgnoreCase("doctor")) {
          return new Doctor();
      } else if (professionType.equalsIgnoreCase("engineer")) {
          return new Engineer();
      }else if (professionType.equalsIgnoreCase("teacher")) {
          return new Teacher();
      }
      else{
          return null;
      }
  }
}

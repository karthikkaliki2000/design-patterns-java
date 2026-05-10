package com.design.patterns.creational.singleton;

public class EagerInitialization {

    public static void main(String[] args){
        System.out.println("Singleton Design Pattern: creating a single instance or object for an entire application and having global point of access");
        Configuration configuration=Configuration.getInstance();
        configuration.loadConfig();
    }
}


class Configuration{

    private static final Configuration configuration=new Configuration();// instantiated at class load time with thread safety and loaded once

    private Configuration(){

    }

    public static Configuration getInstance(){//Thread safe method
       return configuration;
    }


    public void loadConfig(){
        System.out.println("Configuration loaded Successfully");
    }

}

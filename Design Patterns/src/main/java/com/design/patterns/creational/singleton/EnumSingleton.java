package com.design.patterns.creational.singleton;



public class EnumSingleton {

    public static void main(String[] args){
        System.out.println("Singleton Design Pattern: creating a single instance or object for an entire application and having global point of access");
       Singleton singleton=Singleton.SINGLETON;
       singleton.doSomething();
    }
}


enum Singleton{     //ine instance is created by jvm through classloading and makes thread safe and ensures one instance also prevents the reflection and serialization issues

    SINGLETON;

    public void doSomething(){
        System.out.println("Enum Singleton Objected created by jvm internally and accessible with Singleton.SINGLETON");
    }

}

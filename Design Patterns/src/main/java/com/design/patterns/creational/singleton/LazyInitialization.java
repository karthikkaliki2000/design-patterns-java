package com.design.patterns.creational.singleton;

public class LazyInitialization {

    public static void main(String[] args){
        System.out.println("Singleton Design Pattern: creating a single instance or object for an entire application and having global point of access");
        Logger logger=Logger.getInstance();
        logger.log("Successfully created the logger singleton Object with thread safety and lazy initialization");

    }
}


class Logger{

    private static Logger logger;//lazy initialized

    private Logger(){

    }

    public static synchronized Logger getInstance(){//Thread safe method
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }


    public void log(String message){
        System.out.println("log: "+message);
    }

}

package com.design.patterns.creational.singleton;



public class DoubleCheckedLocking {

    public static void main(String[] args){
        System.out.println("Singleton Design Pattern: creating a single instance or object for an entire application and having global point of access");
        ConnectionPool connectionPool=ConnectionPool.getInstance();
        connectionPool.getConnection();
    }
}


class ConnectionPool{

    private static volatile ConnectionPool connectionPool;//lazy initialized and volatile for reading from memory only and avoiding from cache

    private ConnectionPool(){

    }

    public static ConnectionPool getInstance(){//Thread safe method
        if(connectionPool==null){  //first check before lock
            synchronized (ConnectionPool.class){  //lock aquired
                if(connectionPool==null){ //after acquired lock check the instance still null or not
                    connectionPool=new ConnectionPool();
                }
            }
        }
        return connectionPool;
    }


    public void getConnection(){
        System.out.println("Connection Pool Details");
    }

}

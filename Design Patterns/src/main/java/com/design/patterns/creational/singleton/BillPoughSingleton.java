package com.design.patterns.creational.singleton;



public class BillPoughSingleton {

    public static void main(String[] args){
        System.out.println("Singleton Design Pattern: creating a single instance or object for an entire application and having global point of access");
        ThreadPool threadPool=ThreadPool.getInstance();
        threadPool.getThreadPoolDetails();
    }
}


class ThreadPool{     //lazy loading with thread safety

    private ThreadPool(){

    }


    private static class SingletonHelper{
        private static final ThreadPool threadPool=new ThreadPool();//Not called until get instance called
    //Inner classes will be loaded only when it is first actively used and class loading is thread safe by default through jvm
    }

    public static ThreadPool getInstance(){//Thread safe method
       return SingletonHelper.threadPool;
    }


    public void getThreadPoolDetails(){
        System.out.println("ThreadPool Details");
    }

}

package org.balar.javaDesignPatterns.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        System.out.println("Object created");
    }
    
    //If we dont do synchronized method then if two thread created at the same time try to access the getInstance method
    // there will be 2 object initialized
//    public synchronized static Singleton getInstance() {
//        if (singleton==null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
    
    
    // It can also be done more efficiently using synchonized block called "Double Checked Locking"
    //Since we are not putting synchronized keyword at method level, more than one thread can access the method
    // but only the code inside the synchronized block gets secured and threadsafe
    
    public static Singleton getInstance() {
        if (singleton==null){ //first check
            synchronized (Singleton.class){
                if(singleton==null){ //Double check locking
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

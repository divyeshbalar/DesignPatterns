package org.balar.javaDesignPatterns.singleton;

public enum SingletonEnum {
    /*
    Singleton using Enum is the best way to implement the singleton
     */
    
    INSTANCE;
    public int i;
    public void show(){
        System.out.println(i);
    }
}

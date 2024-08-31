package org.balar.javaDesignPatterns.abstractFactoryPattern.model;

public class Ship implements TransportMethod {
    @Override
    public void deliver() {
        System.out.println("Delivering with Ship on water routes!");
    }
}

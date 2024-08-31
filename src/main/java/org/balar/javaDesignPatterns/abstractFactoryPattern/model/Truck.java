package org.balar.javaDesignPatterns.abstractFactoryPattern.model;

public class Truck  implements TransportMethod {
    @Override
    public void deliver() {
        System.out.println("Delivering with Truck!");
    }
}

package org.balar.javaDesignPatterns.fatoryMethodPattern.model;

public class Truck  implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering with Truck!");
    }
}

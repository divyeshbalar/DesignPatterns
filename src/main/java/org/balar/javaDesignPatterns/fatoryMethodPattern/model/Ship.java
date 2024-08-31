package org.balar.javaDesignPatterns.fatoryMethodPattern.model;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering with Ship on water routes!");
    }
}

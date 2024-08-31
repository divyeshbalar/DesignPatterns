package org.balar.javaDesignPatterns.fatoryMethodPattern.service;

import org.balar.javaDesignPatterns.fatoryMethodPattern.model.Transport;
import org.balar.javaDesignPatterns.fatoryMethodPattern.model.Truck;

public class TruckLogisticFactory extends Logistic{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}

package org.balar.javaDesignPatterns.fatoryMethodPattern.service;

import org.balar.javaDesignPatterns.fatoryMethodPattern.model.Ship;
import org.balar.javaDesignPatterns.fatoryMethodPattern.model.Transport;

public class ShipLogisticFactory extends Logistic{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}

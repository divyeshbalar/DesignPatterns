package org.balar.javaDesignPatterns.fatoryMethodPattern.client;

import org.balar.javaDesignPatterns.fatoryMethodPattern.exceptions.InvalidInputException;
import org.balar.javaDesignPatterns.fatoryMethodPattern.service.Logistic;
import org.balar.javaDesignPatterns.fatoryMethodPattern.service.ShipLogisticFactory;
import org.balar.javaDesignPatterns.fatoryMethodPattern.service.TruckLogisticFactory;

public class FactoryConsumer {
    //return the logistic object
    Logistic log;

    public void startOperations(String formOfTransport) throws InvalidInputException{
        if ("water".equalsIgnoreCase(formOfTransport)){
            log = new ShipLogisticFactory();
            log.planDelivery();
        } else if("land".equalsIgnoreCase(formOfTransport)) {
            log = new TruckLogisticFactory();
            log.planDelivery();
        } else {
           throw new InvalidInputException("Invalid form of transport");
        }
    }
}

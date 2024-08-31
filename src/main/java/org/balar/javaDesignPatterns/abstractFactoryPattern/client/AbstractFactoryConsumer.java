package org.balar.javaDesignPatterns.abstractFactoryPattern.client;

import org.balar.javaDesignPatterns.abstractFactoryPattern.service.LandTransportAndBrandObjectFactory;
import org.balar.javaDesignPatterns.abstractFactoryPattern.service.TransportMethodAndBrandFactory;
import org.balar.javaDesignPatterns.abstractFactoryPattern.service.WaterTrasportAndBrandObjectFactory;
import org.balar.javaDesignPatterns.fatoryMethodPattern.exceptions.InvalidInputException;
public class AbstractFactoryConsumer {
    TransportMethodAndBrandFactory log;

    public void startOperations(String formOfTransport) throws InvalidInputException {
        if ("water".equalsIgnoreCase(formOfTransport)){
            log = new WaterTrasportAndBrandObjectFactory();
            log.getTransportAndVendorCombo();

        } else if("land".equalsIgnoreCase(formOfTransport)) {
            log = new LandTransportAndBrandObjectFactory();
            log.getTransportAndVendorCombo();
        } else {
            throw new InvalidInputException("Invalid form of transport");
        }
    }
}

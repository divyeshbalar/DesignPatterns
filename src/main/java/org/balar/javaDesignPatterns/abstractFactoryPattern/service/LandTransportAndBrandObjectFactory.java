package org.balar.javaDesignPatterns.abstractFactoryPattern.service;

import org.balar.javaDesignPatterns.abstractFactoryPattern.model.DeliveryVendor;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.FedEx;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.TransportMethod;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.Truck;

public class LandTransportAndBrandObjectFactory extends TransportMethodAndBrandFactory {

    @Override
    public TransportMethod getTransportMethod() {
        return new Truck();
    }

    @Override
    public DeliveryVendor getDeliveryBrand() {
        return new FedEx();
    }
}

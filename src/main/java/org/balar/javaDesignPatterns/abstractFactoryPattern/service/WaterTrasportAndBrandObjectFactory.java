package org.balar.javaDesignPatterns.abstractFactoryPattern.service;

import org.balar.javaDesignPatterns.abstractFactoryPattern.model.DeliveryVendor;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.Maersk;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.Ship;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.TransportMethod;

public class WaterTrasportAndBrandObjectFactory extends TransportMethodAndBrandFactory {

    @Override
    public TransportMethod getTransportMethod() {
        return new Ship();
    }

    @Override
    public DeliveryVendor getDeliveryBrand() {
        return new Maersk();
    }
}

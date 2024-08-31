package org.balar.javaDesignPatterns.abstractFactoryPattern.service;

import org.balar.javaDesignPatterns.abstractFactoryPattern.model.DeliveryVendor;
import org.balar.javaDesignPatterns.abstractFactoryPattern.model.TransportMethod;

public abstract class TransportMethodAndBrandFactory {
    public void getTransportAndVendorCombo(){
        System.out.println("\ngetting Transport and Vendor objects");
        //Abstract Factory allows to create object in conjunction with family/related objects
        //here in this example its the delivery vendor and the form of trasportation
        this.getTransportMethod().deliver();
        this.getDeliveryBrand().vendorName();
    }
    abstract TransportMethod getTransportMethod();
    abstract DeliveryVendor getDeliveryBrand();
}

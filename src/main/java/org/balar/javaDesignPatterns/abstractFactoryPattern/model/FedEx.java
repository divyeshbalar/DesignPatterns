package org.balar.javaDesignPatterns.abstractFactoryPattern.model;

public class FedEx implements DeliveryVendor {
    public void vendorName() {
        System.out.println("FedEx: Ground Transport Vendor");
    }
}

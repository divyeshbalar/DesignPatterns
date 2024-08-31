package org.balar.javaDesignPatterns.fatoryMethodPattern.service;

import org.balar.javaDesignPatterns.fatoryMethodPattern.model.Transport;

public abstract class Logistic {
    public void planDelivery(){
        System.out.println("Planning Delivery");
        Transport tr= this.createTransport();
        tr.deliver();
    }

    //Factory parent must have atleast one asbtract method returning the parent interface of the product
    // that abstract method gets the implementation in the concrete Factory child classes HOWEVER, it gets called from Factory parent.
    // in this case createTransport is being called from planDelivery.
    protected abstract Transport createTransport();

}

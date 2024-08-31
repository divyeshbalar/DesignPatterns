package org.balar.javaDesignPatterns.observerPattern.observables;

import org.balar.javaDesignPatterns.observerPattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    private final List<IObserver> listOfSubscriber=new ArrayList<>();
    private int temperature=20;

    @Override
    public void add(IObserver subscriber) {
        listOfSubscriber.add(subscriber);
    }

    @Override
    public void remove(IObserver subscriber) {
        listOfSubscriber.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        if (this.temperature > 29){
            for(IObserver subscriber : listOfSubscriber){
                subscriber.update(this);
            }
        } else {
            System.out.println("Temperature changed, but has No update for subscribers! temperature is at OR below 29");
        }
    }

    public void setTemperature(int val){
        this.temperature = val;
        this.notifyObservers();
    }

    @Override
    public String getState() {
        return "Heat Warning, current temperature: "+this.temperature;
    }
}

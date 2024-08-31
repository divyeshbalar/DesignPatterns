package org.balar.javaDesignPatterns.observerPattern.observers;

import org.balar.javaDesignPatterns.observerPattern.observables.IObservable;

public class Observer1 implements IObserver{
    @Override
    public void update(IObservable publisher) {
        System.out.println("Observer 1 got the updates: "+publisher.getState());
    }
}

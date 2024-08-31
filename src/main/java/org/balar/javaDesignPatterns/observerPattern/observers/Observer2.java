package org.balar.javaDesignPatterns.observerPattern.observers;

import org.balar.javaDesignPatterns.observerPattern.observables.IObservable;

public class Observer2 implements IObserver{
    @Override
    public void update(IObservable publisher) {
        System.out.println("Observer 2 got the updates: "+publisher.getState());
    }
}

package org.balar.javaDesignPatterns.observerPattern.observables;

import org.balar.javaDesignPatterns.observerPattern.observers.IObserver;

public interface IObservable {
    public void add(IObserver subscriber);
    public void remove(IObserver subscriber);
    public void notifyObservers();

    String getState();
}

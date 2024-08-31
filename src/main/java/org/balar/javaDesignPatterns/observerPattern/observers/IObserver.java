package org.balar.javaDesignPatterns.observerPattern.observers;

import org.balar.javaDesignPatterns.observerPattern.observables.IObservable;

public interface IObserver {
    public void update(IObservable publisher);
}

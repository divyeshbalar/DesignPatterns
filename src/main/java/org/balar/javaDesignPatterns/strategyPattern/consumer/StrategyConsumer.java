package org.balar.javaDesignPatterns.strategyPattern.consumer;

import org.balar.javaDesignPatterns.strategyPattern.service.CollectionSorter;
import org.balar.javaDesignPatterns.strategyPattern.sort.ISortStrategy;

import java.util.List;

public class StrategyConsumer {

    public void executeSort(ISortStrategy st, List<Integer> listOfInteger){
        new CollectionSorter(st, listOfInteger).executeSort();
    }
}

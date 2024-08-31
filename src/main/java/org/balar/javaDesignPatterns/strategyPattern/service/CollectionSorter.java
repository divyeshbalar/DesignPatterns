package org.balar.javaDesignPatterns.strategyPattern.service;

import org.balar.javaDesignPatterns.strategyPattern.sort.ISortStrategy;

import java.util.List;

public class CollectionSorter {
    ISortStrategy ISortStrategy;
    private List<Integer> listOfInteger;

    public CollectionSorter(ISortStrategy ISortStrategy, List<Integer> listOfInteger) {
        this.ISortStrategy = ISortStrategy;
        this.listOfInteger = listOfInteger;
    }

    public void executeSort(){
        this.ISortStrategy.sort(this.listOfInteger).forEach(System.out::println);

    }

}

package org.balar.javaDesignPatterns.strategyPattern.sort;

import java.util.List;

public class SortByNaturalAscStrategy implements ISortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        list.sort((o1, o2) -> o1>o2 ? 1 : -1);
        return list;
    }
}

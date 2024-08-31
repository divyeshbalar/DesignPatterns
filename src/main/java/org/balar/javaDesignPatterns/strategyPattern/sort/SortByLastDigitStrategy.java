package org.balar.javaDesignPatterns.strategyPattern.sort;

import java.util.List;

public class SortByLastDigitStrategy implements ISortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        list.sort((o1, o2) -> (o1%10) > (o2%10) ? 1 : -1);
        return list;
    }
}

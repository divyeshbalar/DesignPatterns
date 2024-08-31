package org.balar.javaDesignPatterns.strategyPattern.sort;

import java.util.List;

public interface ISortStrategy {
    List<Integer> sort(List<Integer> list);
}

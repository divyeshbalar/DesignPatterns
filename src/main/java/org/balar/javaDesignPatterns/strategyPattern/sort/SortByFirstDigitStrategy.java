package org.balar.javaDesignPatterns.strategyPattern.sort;

import java.util.List;

public class SortByFirstDigitStrategy implements ISortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        list.sort((o1, o2) -> getRemainder(o1) > getRemainder(o2) ? 1 : -1);
        return list;
    }

    public int getRemainder(int obj){
        int remainder=0;
        while(obj>0){
            remainder = obj%10;
            obj=obj/10;
        }
        return remainder;
    }
}

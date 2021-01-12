package com.devcircus.java.algorithms.sort.pancake;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

public class Pancake implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            T max = array[0];
            int index = 0;
            for (int j = 0; j < size - i; j++) {
                if (SortUtils.less(max, array[j])) {
                    max = array[j];
                    index = j;
                }
            }
            SortUtils.flip(array, index, array.length - 1 - i);
        }
        return array;
    }
}

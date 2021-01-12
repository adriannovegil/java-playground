package com.devcircus.java.algorithms.sort.insertion;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

class Insertion implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int j = 1; j < array.length; j++) {
            T key = array[j];
            int i = j - 1;
            while (i >= 0 && SortUtils.less(key, array[i])) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        Insertion sort = new Insertion();
        sort.sort(integers);
        SortUtils.print(integers);
        String[] strings = {"c", "a", "e", "b", "d"};
        sort.sort(strings);
        SortUtils.print(strings);
    }
}

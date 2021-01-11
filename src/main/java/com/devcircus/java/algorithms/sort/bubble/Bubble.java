package com.devcircus.java.algorithms.sort.bubble;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

class Bubble implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0, size = array.length; i < size - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; ++j) {
                if (SortUtils.greater(array[j], array[j + 1])) {
                    SortUtils.swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        Bubble bubbleSort = new Bubble();
        bubbleSort.sort(integers);
        SortUtils.print(integers);
        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        SortUtils.print(bubbleSort.sort(strings));
    }
}

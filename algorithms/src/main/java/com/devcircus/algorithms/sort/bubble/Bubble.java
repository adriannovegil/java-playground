package com.devcircus.algorithms.sort.bubble;

import com.devcircus.algorithms.sort.SortAlgorithm;
import com.devcircus.algorithms.sort.SortUtils;

class Bubble implements SortAlgorithm {

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
}

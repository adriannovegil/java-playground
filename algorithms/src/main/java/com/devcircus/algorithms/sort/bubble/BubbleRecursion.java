package com.devcircus.algorithms.sort.bubble;

import com.devcircus.algorithms.sort.SortAlgorithm;
import com.devcircus.algorithms.sort.SortUtils;

public class BubbleRecursion implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        bubbleSort(unsorted, unsorted.length);
        return unsorted;
    }

    private static <T extends Comparable<T>> void bubbleSort(T[] unsorted, int len) {
        boolean swapped = false;
        for (int i = 0; i < len - 1; ++i) {
            if (SortUtils.greater(unsorted[i], unsorted[i + 1])) {
                SortUtils.swap(unsorted, i, i + 1);
                swapped = true;
            }
        }
        if (swapped) {
            bubbleSort(unsorted, len - 1);
        }
    }
}

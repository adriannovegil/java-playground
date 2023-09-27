package com.devcircus.algorithms.sort.selection;

import com.devcircus.algorithms.sort.SortAlgorithm;
import com.devcircus.algorithms.sort.SortUtils;

public class Selection implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                SortUtils.swap(arr, i, min);
            }
        }
        return arr;
    }
}

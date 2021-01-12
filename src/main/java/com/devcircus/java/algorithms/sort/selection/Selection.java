package com.devcircus.java.algorithms.sort.selection;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

public class Selection implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min].compareTo(arr[j]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
            }
        }
        return arr;
    }

    public <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

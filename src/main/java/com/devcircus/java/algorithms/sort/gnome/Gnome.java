package com.devcircus.java.algorithms.sort.gnome;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

public class Gnome implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int i = 1;
        int j = 2;
        while (i < arr.length) {
            if (SortUtils.less(arr[i - 1], arr[i])) {
                i = j++;
            } else {
                SortUtils.swap(arr, i - 1, i);
                if (--i == 0) {
                    i = j++;
                }
            }
        }
        return null;
    }
}

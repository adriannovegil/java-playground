package com.devcircus.algorithms.sort.gnome;

import com.devcircus.algorithms.sort.SortAlgorithm;
import com.devcircus.algorithms.sort.SortUtils;

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
        return arr;
    }
}

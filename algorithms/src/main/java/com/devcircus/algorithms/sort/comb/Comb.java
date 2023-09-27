package com.devcircus.algorithms.sort.comb;

import com.devcircus.algorithms.sort.SortAlgorithm;
import com.devcircus.algorithms.sort.SortUtils;

class Comb implements SortAlgorithm {

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int size = arr.length;
        int gap = size;
        boolean swapped = true;
        while (gap != 1 || swapped) {
            gap = nextGap(gap);
            swapped = false;
            for (int i = 0; i < size - gap; i++) {
                if (SortUtils.less(arr[i + gap], arr[i])) {
                    swapped = SortUtils.swap(arr, i, i + gap);
                }
            }
        }
        return arr;
    }

    private int nextGap(int gap) {
        gap = (gap * 10) / 13;
        return (gap < 1) ? 1 : gap;
    }
}

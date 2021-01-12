package com.devcircus.java.algorithms.sort.bitonic;

import com.devcircus.java.algorithms.sort.SortAlgorithm;

public class Bitonic implements SortAlgorithm {

    public Integer[] sort(Integer a[], int n, int up) {
        bitonicSort(a, 0, n, up);
        return a;
    }

    private void bitonicSort(Integer a[], int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            bitonicSort(a, low, k, 1);
            bitonicSort(a, low + k, k, 0);
            bitonicMerge(a, low, cnt, dir);
        }
    }

    private void compAndSwap(Integer a[], int i, int j, int dir) {
        if ((a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    private void bitonicMerge(Integer a[], int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                compAndSwap(a, i, i + k, dir);
            }
            bitonicMerge(a, low, k, dir);
            bitonicMerge(a, low + k, k, dir);
        }
    }
}

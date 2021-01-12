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

    public static void main(String[] args) {
        Integer[] integers = {4, 23, 6, 78, 1, 26, 11, 23, 0, -6, 3, 54, 231, 9, 12};
        String[] strings = {"c", "a", "e", "b", "d", "dd", "da", "zz", "AA", "aa", "aB", "Hb", "Z"};
        Gnome gnomeSort = new Gnome();
        gnomeSort.sort(integers);
        gnomeSort.sort(strings);
        System.out.println("After sort : ");
        SortUtils.print(integers);
        SortUtils.print(strings);
    }
}

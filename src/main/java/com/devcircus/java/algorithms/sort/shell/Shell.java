package com.devcircus.java.algorithms.sort.shell;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;

public class Shell implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int length = array.length;
        int gap = 1;
        while (gap < length / 3) {
            gap = 3 * gap + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < length; i++) {
                int j;
                T temp = array[i];
                for (j = i; j >= gap && SortUtils.less(temp, array[j - gap]); j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] toSort = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        Shell sort = new Shell();
        SortUtils.print(sort.sort(toSort));
    }
}

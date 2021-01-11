package com.devcircus.java.algorithms.sort.bubble;

import com.devcircus.java.algorithms.sort.SortAlgorithm;
import com.devcircus.java.algorithms.sort.SortUtils;
import java.util.Random;

public class BubbleRecursion implements SortAlgorithm {

    @Override
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

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100) - 50;
        }
        BubbleRecursion bubbleSortRecursion = new BubbleRecursion();
        bubbleSortRecursion.sort(array);
        for (int i = 0; i < array.length - 1; ++i) {
            assert (array[i].compareTo(array[i + 1]) <= 0);
        }
    }

}

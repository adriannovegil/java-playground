package com.devcircus.algorithms.sort;

import java.util.Arrays;
import java.util.List;

public class SortUtils {

    public static <T> boolean swap(T[] array, int idx, int idy) {
        T swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }

    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    public static <T extends Comparable<T>> boolean greater(T v, T w) {
        return v.compareTo(w) > 0;
    }

    public static <T extends Comparable<T>> void flip(T[] array, int left, int right) {
        while (left <= right) {
            swap(array, left++, right--);
        }
    }

    /**
     * Prints a list
     *
     * @param toPrint - a list which should be printed
     */
    public static void print(List<?> toPrint) {
        toPrint.stream().map(Object::toString).map(str -> str + " ").forEach(System.out::print);

        System.out.println();
    }

    /**
     * Prints an array
     *
     * @param toPrint - an array which should be printed
     */
    public static void print(Object[] toPrint) {
        System.out.println(Arrays.toString(toPrint));
    }

}

package com.devcircus.algorithms.sort.bucket;

import com.devcircus.algorithms.sort.SortAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bucket implements SortAlgorithm {

    public Integer[] sort(Integer[] arr) {
        int max = max(arr);
        int min = min(arr);
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; ++i) {
            buckets.add(new ArrayList<>());
        }
        for (int value : arr) {
            int hash = hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
        return arr;
    }

    private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    private static int max(Integer[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int min(Integer[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

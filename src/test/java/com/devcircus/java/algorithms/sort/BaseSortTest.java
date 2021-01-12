package com.devcircus.java.algorithms.sort;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BaseSortTest {

    private final Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
    private final Integer[] expectedIntegers = {1, 4, 6, 9, 12, 23, 54, 78, 231};
    private final String[] strings = {"c", "a", "e", "b", "d"};
    private final String[] expectedStrings = {"a", "b", "c", "d", "e"};

    public Integer[] getIntegerArrayToSort() {
        return this.integers;
    }

    public Integer[] getSortedIntegerArray() {
        return this.expectedIntegers;
    }

    public String[] getStringArrayToSort() {
        return this.strings;
    }

    public String[] getSortedStringArray() {
        return this.expectedStrings;
    }
}

package com.devcircus.algorithms.sort;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BaseSortTest {

    private final Integer[] integersArray = {4, 23, 6, 78, 1, 54, 231, 9, 12};
    private final Integer[] integersArrayWith2NCompatibleNumberOfElements = {4, 23, 6, 78, 1, 54, 231, 9};
    private final Integer[] integersArrayWithout2NCompatibleNumberOfElements = {4, 23, 6, 78, 1, 54, 231, 9, 12};
    private final Integer[] expectedIntegersArray = {1, 4, 6, 9, 12, 23, 54, 78, 231};
    private final Integer[] expectedIntegersArrayWith2NCompatibleNumberOfElements = {1, 4, 6, 9, 23, 54, 78, 231};
    private final Integer[] expectedIntegersArrayWithout2NCompatibleNumberOfElements = {1, 4, 6, 9, 12, 23, 54, 78, 231};

    private final String[] stringsArray = {"c", "a", "e", "b", "d"};
    private final String[] stringsArrayWith2NCompatibleNumberOfElements = {"g", "c", "f", "a", "e", "h", "b", "d"};
    private final String[] stringsArrayWithout2NCompatibleNumberOfElements = {"c", "a", "e", "b", "d"};
    private final String[] expectedStringsArray = {"a", "b", "c", "d", "e"};
    private final String[] expectedStringsArrayWith2NCompatibleNumberOfElements = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private final String[] expectedStringsArrayWithout2NCompatibleNumberOfElements = {"a", "b", "c", "d", "e"};

    public Integer[] getIntegersArray() {
        return this.integersArray;
    }

    public Integer[] getIntegersArrayWith2NCompatibleNumberOfElements() {
        return this.integersArrayWith2NCompatibleNumberOfElements;
    }

    public Integer[] getIntegersArrayWithout2NCompatibleNumberOfElements() {
        return this.integersArrayWithout2NCompatibleNumberOfElements;
    }

    public Integer[] getExpectedIntegersArray() {
        return this.expectedIntegersArray;
    }

    public Integer[] getExpectedIntegersArrayWith2NCompatibleNumberOfElements() {
        return this.expectedIntegersArrayWith2NCompatibleNumberOfElements;
    }

    public Integer[] getExpectedIntegersArrayWithout2NCompatibleNumberOfElements() {
        return this.expectedIntegersArrayWithout2NCompatibleNumberOfElements;
    }

    public String[] getStringsArray() {
        return this.stringsArray;
    }

    public String[] getStringsArrayWith2NCompatibleNumberOfElements() {
        return this.stringsArrayWith2NCompatibleNumberOfElements;
    }

    public String[] getStringsArrayWithout2NCompatibleNumberOfElements() {
        return this.stringsArrayWithout2NCompatibleNumberOfElements;
    }
    
    public String[] getExpectedStringsArray() {
        return this.expectedStringsArray;
    }

    public String[] getExpectedStringsArrayWith2NCompatibleNumberOfElements() {
        return this.expectedStringsArrayWith2NCompatibleNumberOfElements;
    }

    public String[] getExpectedStringsArrayWithout2NCompatibleNumberOfElements() {
        return this.expectedStringsArrayWithout2NCompatibleNumberOfElements;
    }
}

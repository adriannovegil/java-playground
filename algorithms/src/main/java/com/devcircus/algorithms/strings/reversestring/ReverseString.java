package com.devcircus.algorithms.strings.reversestring;

import com.devcircus.algorithms.strings.StringAlgorithm;

/**
 * Reverse String using different version
 */
public class ReverseString implements StringAlgorithm {

    /**
     * easiest way to reverses the string str and returns it
     *
     * @param str string to be reversed
     * @return reversed string
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * second way to reverses the string str and returns it
     *
     * @param str string to be reversed
     * @return reversed string
     */
    public static String reverseAsCharArray(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] value = str.toCharArray();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return new String(value);
    }

    /**
     * @param str string to be reversed
     * @return reversed string
     */
    public static String reverseRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseRecursion(str.substring(1)) + str.charAt(0);
        }
    }
}

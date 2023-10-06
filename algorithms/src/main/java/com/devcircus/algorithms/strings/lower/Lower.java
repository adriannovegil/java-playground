package com.devcircus.algorithms.strings.lower;

import com.devcircus.algorithms.strings.StringAlgorithm;

public class Lower implements StringAlgorithm {

    /**
     * Converts all of the characters in this {@code String} to lower case
     *
     * @param s the string to convert
     * @return the {@code String}, converted to lowercase.
     */
    public static String toLowerCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }
}

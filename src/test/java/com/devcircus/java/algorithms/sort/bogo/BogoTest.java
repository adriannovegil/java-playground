package com.devcircus.java.algorithms.sort.bogo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BogoTest {

    private final Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
    private final Integer[] expectedIntegers = {1, 4, 6, 9, 12, 23, 54, 78, 231};
    private final String[] strings = {"c", "a", "e", "b", "d"};
    private final String[] expectedStrings = {"a", "b", "c", "d", "e"};

    private Bogo bogo;

    @Before
    public void setUp() {
        bogo = new Bogo();
    }

    @Test
    public void testSortWithIntegers() {
        Bogo bogoSort = new Bogo();
        assertArrayEquals(bogo.sort(integers), expectedIntegers);
    }

    @Test
    public void testSortWithStrings() {
        Bogo bogoSort = new Bogo();
        assertArrayEquals(bogo.sort(strings), expectedStrings);
    }
}

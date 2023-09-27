package com.devcircus.algorithms.sort.gnome;

import com.devcircus.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class GnomeTest extends BaseSortTest{

    private Gnome sortter;

    @Before
    public void setUp() {
        sortter = new Gnome();
    }

    @Test
    public void testSortWithIntegers() {
        assertArrayEquals(sortter.sort(getIntegersArray()), getExpectedIntegersArray());
    }

    @Test
    public void testSortWithStrings() {
        assertArrayEquals(sortter.sort(getStringsArray()), getExpectedStringsArray());
    }
}

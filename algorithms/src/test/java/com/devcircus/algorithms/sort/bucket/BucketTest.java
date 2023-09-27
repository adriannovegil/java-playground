package com.devcircus.algorithms.sort.bucket;

import com.devcircus.algorithms.sort.BaseSortTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Adrian Novegil <adrian.novegil@gmail.com>
 */
public class BucketTest extends BaseSortTest{

    private Bucket sortter;
    
    @Before
    public void setUp() {
        sortter = new Bucket();
    }
    
    @Test
    public void testSortWithIntegers() {
        assertArrayEquals(sortter.sort(getIntegersArray()), getExpectedIntegersArray());
    }
}

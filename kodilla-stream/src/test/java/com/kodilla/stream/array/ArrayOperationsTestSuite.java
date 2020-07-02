package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //When
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Then
        Assert.assertEquals(ArrayOperations.getAverage(numbers), 5.5, 0);
    }
    @Test
    public void testGetAverageEmptyTable() {
        //When
        int[] numbers = {};
        //Then
        Assert.assertEquals(0, ArrayOperations.getAverage(numbers), 0);
    }
}

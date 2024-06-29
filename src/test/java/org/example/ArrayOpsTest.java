package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ArrayOpsTest extends TestCase {

    @Test
    public void testFindThreeLargest_TypicalCase() {

        final int[] arr = {6, 8, 1, 9, 2, 1, 10, 11};

        final int[] expected = {11, 10, 9};

        assertArrayEquals(expected, ArrayOps.findThreeLargest(arr));
    }

    @Test
    public void testFindThreeLargest_DuplicateValues() {
         int[] arr = {6, 8, 1, 9, 2, 1, 10, 10};

         int[] expected = {10, 10, 9};

        assertArrayEquals(expected, ArrayOps.findThreeLargest(arr));

    }
    @Test
    public  void testFindThreeLargest_FewerThanThreeElements(){
        int[] arr =  {10,5};
assertThrows(IllegalArgumentException.class,()->ArrayOps.findThreeLargest(arr));
    }
    @Test
    public void testFindFindSecondLargest_TypicalCase(){
        int[] arr = {6, 8, 1, 9, 2, 1, 10, 10};

        int expected =  9;
      assertEquals(expected,ArrayOps.findSecondLargest(arr));
    }
    @Test
    public void testMoveAllZerosToEndOfArray_TypicalCase(){
        int[] arr = {6, 8, 0, 9, 2, 0, 10, 10};

        int [] expected = {6, 8, 9, 2, 10, 10, 0, 0};
        assertArrayEquals(expected,ArrayOps.moveAllZerosToEndOfArray(arr));
    }
}
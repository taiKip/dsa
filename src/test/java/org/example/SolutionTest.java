package org.example;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SolutionTest extends TestCase {
    @Test
    public void testTwoSum_TypicalCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, Solution.twoSum(nums, target));
    }
}
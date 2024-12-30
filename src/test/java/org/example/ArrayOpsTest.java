package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOpsTest {

    @Test
    void twoSum() {
        //given
        final var nums = new int []{2,5,7,9,11};
        final var target = 12;
        //when
        final var result = ArrayOps.twoSum(nums, target);

        final var expected = new int[]{2,1};
        //then
        Assertions.assertArrayEquals(result,expected);
    }
}
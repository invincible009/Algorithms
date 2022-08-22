package com.sdl.EducativeIo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumFromArrayTest {

    @Test
    public void Maxsum_of_contiguous_subarray(){
        int[] numbers ={2,1,5,1,3,2,4,5,2,3,6};
        int key = 3;
        MaxSumFromArray sumFromArray = new MaxSumFromArray();
        int actual = sumFromArray.maxsumOfSubarray2(numbers, key);
        assertEquals(11, actual);
    }

    @Test
    public void Index_of_contiguous_subarray(){
        int[] numbers ={2,1,5,1,3,2};
        int key = 3;
        MaxSumFromArray sumFromArray = new MaxSumFromArray();
        List<Integer> actual = sumFromArray.IndexOfMaxSumOfSubarray(numbers, key);

    }

}
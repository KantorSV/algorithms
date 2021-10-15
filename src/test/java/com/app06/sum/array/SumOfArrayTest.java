package com.app06.sum.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SumOfArrayTest {

    @Test
    public void sumTest(){
        SumOfArray sumOfArray = new SumOfArray();
        int[] data = {1,2,3,4,5};
        int sum=sumOfArray.sum(data);
        assertTrue(sum==15);
    }

}

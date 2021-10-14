package com.app02.swap;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MySwapTest {
    private MySwap swap = new MySwap();

    @Test
    public void swapTest(){
        int[] data = {3,7,9,1,-5,4};
        swap.swap(data, 1, 4);
        assertTrue(data[1]==-5);
        assertTrue(data[4]==7);
    }

    @Test
    public void swap2Test(){
        int[] data = {3,7,9,1,-5,4};
        swap.swap2(data,1,4);
        assertTrue(data[1]==-5);
        assertTrue(data[4]==7);
    }

}

package com.app09.evencount.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvenCountArrayTest {

    @Test
    public void test(){
        int[] data = {2,4,6,8,3,5,7,9};
        EvenCountArray evenCountArray = new EvenCountArray();
        int count = evenCountArray.findEvenCount(data);
        assertTrue(4==count);
    }

}

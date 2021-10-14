package com.app03.rever.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class MyRevertTest {
    private MyRevert myRevert = new MyRevert();

    @Test
    public void oddTest(){
        int[] data = {1,2,3,4,5,6,7};
        myRevert.revert(data);
        assertTrue(data[0]==7);
        assertTrue(data[1]==6);
        assertTrue(data[2]==5);
        assertTrue(data[3]==4);
        assertTrue(data[4]==3);
        assertTrue(data[5]==2);
        assertTrue(data[6]==1);
    }

    @Test
    public void evenTest(){
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int[] expectedData = {10,9,8,7,6,5,4,3,2,1};
        myRevert.revert(data);
        assertTrue(Arrays.equals(data, expectedData));
    }
}

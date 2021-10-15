package com.app08.avg.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AvgArrayTest {

    @Test
    public void avgTest(){
        AvgArray avgArray = new AvgArray();
        int[] data = {1,2,3,4,5,6,7,8,9};
        //S(n) = (a1+an)/2*n=45
        double avg = avgArray.avg(data);
        assertTrue(avg==5);
    }
}

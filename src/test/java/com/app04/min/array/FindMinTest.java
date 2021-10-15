package com.app04.min.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindMinTest {

    @Test
    public void test(){
        int[] data = {10,5,-4,300,150};
        FindMin findMin = new FindMin();
        int res = findMin.min(data);
        assertTrue(res==-4);
    }

}

package com.app05.max.array;

import com.app04.min.array.FindMin;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindMaxTest {

    @Test
    public void test(){
        int[] data = {10,5,-4,300,150};
        FindMax findMax = new FindMax();
        int res = findMax.max(data);
        assertTrue(res==300);
    }

}

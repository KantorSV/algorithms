package com.app11.findsecondmax;

import com.app11.secondmax.SecondMax;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindSecondMaxTest {
    private SecondMax secondMax = new SecondMax();

    @Test
    public void findSecondMaxTest(){
        int[] data = {2,6,8,1,0,9,4,5};
        int res = secondMax.findSecondMax(data);
        assertTrue(res==8);
        res = secondMax.findSecondMax2(data);
        assertTrue(res==8);
    }

    @Test(expected = RuntimeException.class)
    public void sameDataTest(){
        int[] data = {1,1,1,1,1,1,1,1};
        secondMax.findSecondMax(data);
    }

    @Test(expected = RuntimeException.class)
    public void sameDataTest2(){
        int[] data = {1,1,1,1,1,1,1,1};
        secondMax.findSecondMax2(data);
    }


}

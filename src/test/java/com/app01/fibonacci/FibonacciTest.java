package com.app01.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testEmpty(){
        int[] res = fibonacci.createNumbers(0);
        assertTrue(res.length==0);
    }

    @Test
    public void testSingle(){
        int[] res = fibonacci.createNumbers(1);
        assertTrue(res.length==1);
        assertTrue(res[0]==0);
    }

    @Test
    public void testFibonacci(){
        int[] res = fibonacci.createNumbers(9);
        assertTrue(res.length==9);
        assertTrue(res[0]==0);
        assertTrue(res[1]==1);
        assertTrue(res[8]==21);
    }

}

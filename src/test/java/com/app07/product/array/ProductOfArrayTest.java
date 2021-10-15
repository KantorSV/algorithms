package com.app07.product.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductOfArrayTest {

    @Test
    public void productTest(){
        int[] data = {2,3,5,6};
        ProductOfArray productOfArray = new ProductOfArray();
        int product = productOfArray.product(data);
        assertTrue(product==180);
    }

}

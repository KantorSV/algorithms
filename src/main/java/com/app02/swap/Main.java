package com.app02.swap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9};
        MySwap swap = new MySwap();
        swap.swap(data, 3, 7);
        System.out.println(Arrays.toString(data));
    }

}

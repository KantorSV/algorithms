package com.app01.fibonacci;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int[] res = fibonacci.createNumbers(9);
        System.out.println(Arrays.toString(res));
    }

}

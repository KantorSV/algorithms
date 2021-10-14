package com.app02.swap;

public class MySwap {

    public void swap(int[] data, int i, int j){
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void swap2(int[] data, int i, int j){
        /*
        int a = data[i];
        int b = data[j];
        a = a+b;
        b = a-b;
        a = a-b;
        */

        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];

    }
}

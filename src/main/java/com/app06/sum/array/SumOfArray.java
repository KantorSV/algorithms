package com.app06.sum.array;

public class SumOfArray {

    public int sum(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
        }
        return sum;
    }
}

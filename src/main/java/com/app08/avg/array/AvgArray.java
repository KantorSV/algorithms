package com.app08.avg.array;

import com.app06.sum.array.SumOfArray;

public class AvgArray {

    public double avg(int[] data){
        SumOfArray sumOfArray = new SumOfArray();
        int sum = sumOfArray.sum(data);
        double avg = sum/data.length;
        return avg;
    }

}

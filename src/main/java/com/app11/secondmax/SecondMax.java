package com.app11.secondmax;

import java.util.Arrays;

public class SecondMax {

    // [9,5,-1,1,4,2,3]
    // [5,9,-1,1,4,2,3]
    // [-5,-7,1,2,3,4,5,6]

    /*
    maxFirst = -5;
    maxSecond = -7

    data[2] = 1
    maxSecond = maxFirst
    maxFirst = data[2];

    maxFirst = 1
    maxSecond = -5

     */

    //[-5,-7,-6,1,2,3,4,5]
    /*maxFirst = -5;
    maxSecond = -7;
    data[2] = -6

    -------------------
    maxFirst=-5
    maxSecond = dataa[2] = -6*/


    public int findSecondMax(int[] data){
        int maxFirst = Math.max(data[0], data[1]);
        int maxSecond = Math.min(data[1], data[1]);
        for(int i=2;i<data.length;i++){
            if(data[i]>maxFirst){
                maxSecond = maxFirst;
                maxFirst = data[i];
            }else if(data[i]>maxSecond){
                maxSecond = data[i];
            }

        }
        if(maxFirst==maxSecond){
            //System.out.println("WARNING! secondMax==firstMax");
            makeException();
        }
        return maxSecond;
    }

    //[1,3,5,7,9]
    public int findSecondMax2(int[] data){
        Arrays.sort(data);
        int n = data.length;
        if(data[n-1]==data[n-2]){
            makeException();
        }
        return data[n-2];
    }


    private void makeException(){
        throw new RuntimeException("SecondMax==firstMax");
    }
}

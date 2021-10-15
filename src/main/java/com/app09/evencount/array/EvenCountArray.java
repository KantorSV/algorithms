package com.app09.evencount.array;

public class EvenCountArray {

    public int findEvenCount(int[] data){
        int count = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]%2==0){
                count++;
            }
        }
        return count;
    }

}

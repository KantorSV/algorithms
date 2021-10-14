package com.app03.rever.array;

import com.app02.swap.MySwap;

public class MyRevert {

    public void revert(int[] data){
        MySwap mySwap = new MySwap();
        for(int i=0;i<data.length/2;i++){
            mySwap.swap(data, i, data.length-1-i);
        }
    }

}

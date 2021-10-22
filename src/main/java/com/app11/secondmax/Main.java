package com.app11.secondmax;

public class Main {

    public static void main(String[] args) {
        SecondMax secondMax = new SecondMax();
        int[] data = {1,3,7,0,2,8,5};
        int res = secondMax.findSecondMax(data);
        System.out.println("res="+res);
        System.out.println("---------------------");
        res = secondMax.findSecondMax2(data);
        System.out.println("res2="+res);
        System.out.println("---------------------");
        data = new int[]{2,2,2,2,2,2,2,2,2};
        secondMax.findSecondMax(data);
    }

}

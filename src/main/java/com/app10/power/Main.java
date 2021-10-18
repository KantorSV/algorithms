package com.app10.power;

public class Main {

    public static void main(String[] args) {
        MyPower myPower = new MyPower();
        //2^4=2*2*2*2 = 16
        int result = myPower.power(2, 4);
        System.out.println("2 power 4 = "+result);
    }

}

package com.FourPountTwoNine;

public class SumOfAsterisks {
    public void printAsterisks(int num){
        if(num>0 && num <21){
            for (int i=0; i<= num; i++ ){
                for (int j = 0; j <= num ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

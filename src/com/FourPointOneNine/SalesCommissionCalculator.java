package com.FourPointOneNine;

public class SalesCommissionCalculator {
    public double getItemValue(int itemNumber){
        double value = 0.0;
        switch (itemNumber){
            case 1: {
                value = 239.99;
                break;
            }
            case 2: {
                value = 129.75;
                break;
            }
            case 3: {
                value = 99.95;
                break;
            }
            case 4: {
                value = 350.89;
                break;
            }
        }
        return value;

    }
    public int calculateEarnings(int itemNumber, int numberOfItemsSold){
        int itemValue = (int) getItemValue(itemNumber);
        int basePay = 200;
        int earnings = numberOfItemsSold * itemValue + basePay;
        return earnings;
    }
}

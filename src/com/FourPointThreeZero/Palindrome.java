package com.FourPointThreeZero;

public class Palindrome {
    public boolean checkPalindrome(int num) {
        System.out.println(num);
        StringBuilder stringBuilder;
        String reversedNumber;
        if (num > 9999 && num < 100_000) {
            System.out.println(num);
            String stringRepresentationOfNumber = Integer.toString(num);
            stringBuilder = new StringBuilder(stringRepresentationOfNumber);
            stringBuilder.reverse();
            reversedNumber = stringBuilder.toString();
            System.out.println(reversedNumber);
            int integerValueOfReversedNumber = Integer.parseInt(reversedNumber);
            if (integerValueOfReversedNumber == num){
                return true;
            } else{
                return false;
            }
        }
        System.out.println("Number is out of range");
        return false;
    }
}

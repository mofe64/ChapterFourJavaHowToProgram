package com.FourPointTwoOne;

public class LargestNumber {
    public int findLargest(int[] numberArray){
        int largest = 0;
        for(int counter = 0; counter < numberArray.length; counter ++){
            int number = numberArray[counter];
            if(largest < number){
                largest = number;
            }
        }
        return largest;
    }
    public String largestTwoNumbers(int[] numberArray) {
        int largest =0;
        int secondLargest = 0;
        for (int counter=0; counter < numberArray.length; counter++){
            int number = numberArray[counter];
            if(largest < number){
                secondLargest = largest;
                largest = number;
            }
        }
        return "Largest two numbers are " + largest + " and " + secondLargest;
    }
}

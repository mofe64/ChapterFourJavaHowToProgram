package com.FourPointOneSeven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();
        int tripNumbers = 0;
        System.out.println("Enter number of trips");
        tripNumbers = input.nextInt();
        for (int i = 0; i < tripNumbers; i++) {
            System.out.println("Enter miles driven for trip number " + (i+1));
            double milesDriven = input.nextDouble();
            System.out.println("Enter gallons used for trip number " + (i+1));
            double gallonsUsed = input.nextDouble();
            System.out.println(gasMileage.calculateGasMileage(milesDriven, gallonsUsed));
        }
        System.out.println("Total number of miles per gallon for all " + tripNumbers + " trips is "
                + gasMileage.getTotalMilesPerGallonForAllTrips());
    }
}

package com.FourPointOneSeven;

public class GasMileage {
    private int totalMilesPerGallonForAllTrips;

    public double calculateGasMileage(double milesDriven, double gallonsUsed){
        double milesPerGallon = milesDriven / gallonsUsed;
        totalMilesPerGallonForAllTrips +=milesPerGallon;
        return milesPerGallon;
    }

    public int getTotalMilesPerGallonForAllTrips() {
        return totalMilesPerGallonForAllTrips;
    }
}

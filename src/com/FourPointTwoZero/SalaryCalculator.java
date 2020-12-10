package com.FourPointTwoZero;

public class SalaryCalculator {
    public double calculateSalary(int hoursWorked, double hourlyRates){
        if(hoursWorked <= 40){
            return hoursWorked * hourlyRates;
        } else {
            double salaryForFirst40Hours = 40 * hourlyRates;
            double salaryForRemainderOfHours = (hoursWorked - 40) * (hourlyRates * 1.5);
            return  salaryForFirst40Hours + salaryForRemainderOfHours;
        }
    }
}


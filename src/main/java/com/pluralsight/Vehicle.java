package com.pluralsight;
import java.util.*;

public class Vehicle extends  Asset{
    String makeModel;
    int year;
    int odometer;

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int year, int odometer) {
        super(dateAcquired,description, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "originalCost=" + originalCost +
                ", dateAcquired='" + dateAcquired + '\'' +
                ", odometer=" + odometer +
                ", year=" + year +
                ", makeModel='" + makeModel + '\'' +
                '}';
    }
    public double getValue(){
        int currentYear = 2025;
        int age = currentYear - year;
        double value;
            if (age <=3){
                return this.originalCost * Math.pow(.97,age);
            }
            else if (age >3 && age <= 6){
                return this.originalCost * Math.pow(.94,age);
            }
            else if (age > 6 && age <=10){
                return this.originalCost * Math.pow(.91,age);
            }
            else if (age > 10) {
                return 1000.00;
            }
            else {
                System.out.println("error");
            }

        return originalCost;
    }
}

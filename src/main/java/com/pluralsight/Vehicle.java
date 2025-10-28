package com.pluralsight;

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

    public Vehicle(String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(dateAcquired, originalCost);
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
}

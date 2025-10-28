package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

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
    public double getValue(double vehicleValue){
        List<Vehicle> vehicleList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList){
            if (vehicle.year <=3){
                System.out.printf("Your car value is %.2f", vehicle.originalCost * .97 );
            }
            else if (vehicle.year >3 && vehicle.year <= 6){
                System.out.printf("Your car value is %.2f", vehicle.originalCost * .94);
            }
            else if (vehicle.year > 6 && vehicle.year >=10){
                System.out.printf("Your car value us %.2f", vehicle.originalCost * .92);
            }
            else if (vehicle.year > 10) {
                System.out.println("Your car value is" + 1000.00 );
            }
            else {
                System.out.println("error");
            }
        }

        return vehicleValue;
    }
}

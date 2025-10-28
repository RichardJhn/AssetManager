package com.pluralsight;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Asset jewel = new Asset("June","Jewel",12000.00);

        ArrayList<Asset> assets = new ArrayList<>();
        House h = new House("2010", "Mansion",1000000.00,"12321 Mcdonalds rd", 5 ,21213,13000);
        Vehicle v = new Vehicle("2020", "Toyota", 10000.00,"Camry Sedan",5,24342);

        assets.add(jewel);
        assets.add(h);
        assets.add(v);


        for(Asset a : assets){
            System.out.println("----------------");
            System.out.println("Date Acquired: " + a.dateAcquired);
            System.out.println("Description: " + a.description);
            System.out.println("Original Cost: " + a.originalCost);
            System.out.println("Current Value: " + a.getValue());

        }
    }
}

package com.pluralsight;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Asset jewel = new Asset("June","Jewel",12000.00);

        ArrayList<Asset> assets = new ArrayList<>();
        House h = new House("2010", "Mansion",1000000.00,"12321 Mcdonalds rd", 20 ,21213,130);
        assets.add(jewel);
        assets.add(h);


        for(Asset a : assets){
            System.out.println("----------------");
            System.out.println("Date Acquired: " + a.dateAcquired);
            System.out.println("Description: " + a.description);
            System.out.println("Original Cost: " + a.originalCost);
            System.out.println("Current Value: " + a.getValue());

        }
    }
}

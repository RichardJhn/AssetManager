package com.pluralsight;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Asset jewel = new Asset("June","Jewel",12000.00);

        ArrayList<Asset> assets = new ArrayList<>();
        House h = new House("2010", "Mansion",1000000.00,"12321 Mcdonalds rd", 1 ,21213,13000);
        House h2 = new House("2020","My house",234232.00,"1232 My road",2,31233,123434);
        Vehicle v = new Vehicle("2020", "Toyota", 10000.00,"Camry Sedan",2019,24342);
        Vehicle v2 = new Vehicle("2021","Toyta",58000.00,"Supra",2018,124321);

        assets.add(jewel);
        assets.add(h);
        assets.add(v);
        assets.add(h2);
        assets.add(v2);



        for(Asset a : assets){
            System.out.println("----------------");
            System.out.println("Date Acquired: " + a.dateAcquired);
            System.out.println("Description: " + a.description);
            System.out.printf("Original Cost: $%.2f \n", a.originalCost);
            System.out.printf("Current Value: $%.2f \n", a.getValue());

        }
    }
}

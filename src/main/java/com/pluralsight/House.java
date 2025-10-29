package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public House(String dateAcquired, String description, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(dateAcquired,description, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "originalCost=" + originalCost +
                ", dateAcquired='" + dateAcquired + '\'' +
                ", lotSize=" + lotSize +
                ", squareFoot=" + squareFoot +
                ", condition=" + condition +
                ", address='" + address + '\'' +
                '}';
    }

    public double getValue(){
        double pricePerSquareFoot;
        switch (condition){
            case 1:
                pricePerSquareFoot = 180;
                break;
            case 2:
                pricePerSquareFoot = 130;
                break;
            case 3:
                pricePerSquareFoot = 90;
                break;
            case 4:
                pricePerSquareFoot = 80;
                break;
            default:
                pricePerSquareFoot = 0;

        }
        return (pricePerSquareFoot * this.squareFoot) + (this.lotSize * 0.25);

    }


}

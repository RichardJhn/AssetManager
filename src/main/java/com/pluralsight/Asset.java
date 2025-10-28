package com.pluralsight;

public class Asset {
    protected String dateAcquired;
    protected double originalCost;

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public Asset(String dateAcquired, double originalCost) {
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
}

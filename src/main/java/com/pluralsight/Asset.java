package com.pluralsight;

public abstract class Asset {
    protected String dateAcquired;
    protected String description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Asset(String dateAcquired,String description, double originalCost) {
        this.dateAcquired = dateAcquired;
        this.description = description;
        this.originalCost = originalCost;
    }
    public abstract double getValue();

}

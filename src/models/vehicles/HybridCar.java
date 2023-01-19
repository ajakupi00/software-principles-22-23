package models.vehicles;

import models.vehicles.interfaces.Rechargeable;

public class HybridCar extends Vehicle implements Rechargeable {
    private int batteryPercentage;

    public HybridCar() {
        super(VehicleSize.SMALL, 50);
        this.batteryPercentage = (int) ((Math.random() * (100 - 1)) + 1);
    }

    @Override
    public int payTerminal() {
        return this.getPayAmount();
    }

    @Override
    public void rechargeBattery() {
        if(this.batteryPercentage >= 10){
            System.err.println("No need for charging the battery because battery percentage is " + this.batteryPercentage);
        }else{
            System.err.println("Recharging the car.");
            this.batteryPercentage = 100;
            System.err.println("Car fully charged.");
        }
    }


    @Override
    public String toString() {
        return "HybridCar";
    }
}
package it.develhope.abstract_override.entities;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("The vehicle is " + type + " and it has " + numberOfWheels + " wheels");
    }

    /**
     * created abstract method implemented in subclass Car
     */
    public abstract void doVehicleSound();
}

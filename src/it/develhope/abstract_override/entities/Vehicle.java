package it.develhope.abstract_override.entities;
/**
 * This abstract class represents a Vehicle and one of its methods is abstract
 */
public abstract class Vehicle {
    public String type;
    public int numberOfWheels;


    /**
     * Method that prints the vehicle's details
     */
    public void showVehicleDetails(){
        System.out.println("The vehicle is " + type + " and it has " + numberOfWheels + " wheels");
    }

    /**
     * Abstract method that needs to be implemented for revealing the vehicle sound
     */
    public abstract void doVehicleSound();
}

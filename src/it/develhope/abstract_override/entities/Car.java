package it.develhope.abstract_override.entities;

public class Car extends Vehicle{
    private int numberOfDoors;
    private double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The number of doors is " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Wroom wroom");
    }

    /**
     * Car constructor
     * @param type  The type of vehicle
     * @param wheels and int number of wheels of the Car
     * @param doors a double number of doors of the car
     * @param price an int number for the price of the car
     */
    public Car (String type, int wheels, int doors, int price){
        this.setNumberOfWheels(wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.setType(type);
    }


}

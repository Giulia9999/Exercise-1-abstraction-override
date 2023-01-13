package it.develhope.abstract_override.entities;

public class Car extends Vehicle{
    public int numberOfDoors;
    public double carPrice;

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
     * Constructor of subclass Car created
     * @param wheels The number of wheels of the Car
     * @param doors The number of doors of the car
     * @param price The price of the car
     */
    public Car (String type, int wheels, int doors, int price){
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.type = type;
    }


}

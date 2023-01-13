package it.develhope.abstract_override.entities;

public class Boat extends Vehicle{
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound");
    }

    /**
     * Constructor method for Boat
     * @param maxSpeed double representing the maximum Boat speed in knots
     * @param weight an int for the total weight in kilos
     */
    public  Boat(String type, double maxSpeed, int weight){
        this.setType(type);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    /**
     * define boat method
     * @return The weight of the boat in kilos(kg), the speed in knots.
     */
    public String getBoatWeightAndSpeed(){
        return "Total kilos weight is " + boatKilosWeight + "kg  and maximum speed is " + maxKnotsSpeed + "knots";
    }
}

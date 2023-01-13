package it.develhope.abstract_override.entities;

public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("Boat sound");
    }
    public  Boat(String type, double maxSpeed, int weight){
        this.type = type;
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return "Total kilos weight is " + boatKilosWeight + " and maximum speed is " + maxKnotsSpeed;
    }
}

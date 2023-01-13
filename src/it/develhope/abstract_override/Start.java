package it.develhope.abstract_override;
import it.develhope.abstract_override.entities.Car;
import it.develhope.abstract_override.entities.Boat;
public class Start {
    public static void main(String[] args) {
        Car car = new Car("car", 4, 5, 15000);
        Boat boat = new Boat("boat", 50.6, 205);

        car.doVehicleSound();
        boat.doVehicleSound();

        car.showVehicleDetails();
        boat.showVehicleDetails();

        String weightAndSpeed = boat.getBoatWeightAndSpeed();
        System.out.println(weightAndSpeed);

    }
}

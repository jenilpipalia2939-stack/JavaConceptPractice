package Inheritance;

public class Car extends Vehicle {

    public Car(String make, String model, String year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
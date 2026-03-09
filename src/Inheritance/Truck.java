package Inheritance;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, String year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public double calculateFuelEfficiency() {
        return 0;
    }

    @Override
    public double calculateDistanceTraveled() {
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }
}

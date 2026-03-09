package Inheritance;

public abstract class Vehicle {
    private String make;
    private String model;
    private String year;
    private String fuelType;

    public Vehicle(String make, String model, String year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();

    public void drive() {
        System.out.println("I'm a Vehicle");
    }
}
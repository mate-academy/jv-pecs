package core.mate.academy.model;

public class Truck extends Machine implements Workable {
    private String brand;
    private double payloadCapacity;
    private int numberOfAxles;
    private String fuelType;

    public Truck() {

    }

    public Truck(String brand, double payloadCapacity, int numberOfAxles, String fuelType) {
        this.brand = brand;
        this.payloadCapacity = payloadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

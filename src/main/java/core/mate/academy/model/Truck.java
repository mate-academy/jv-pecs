package core.mate.academy.model;

public class Truck extends Machine {
    private int maxSpeed;
    private String fuelType;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

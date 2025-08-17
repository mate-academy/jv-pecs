package core.mate.academy.model;

public class Truck extends Machine {
    private String fuelType;
    private int mileage;

    public Truck() {
    }

    public int getMileage() {
        return mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}

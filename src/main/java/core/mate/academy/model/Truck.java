package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private int fuelPerHour;
    private int size;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getFuelPerHour() {
        return fuelPerHour;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelPerHour(int fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int axelNumber;
    private Double loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int axelNumber, Double loadCapacity) {
        this.setName(name);
        this.setColor(name);
        this.axelNumber = axelNumber;
        this.loadCapacity = loadCapacity;
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getAxelNumber() {
        return axelNumber;
    }

    public void setAxelNumber(int axelNumber) {
        this.axelNumber = axelNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

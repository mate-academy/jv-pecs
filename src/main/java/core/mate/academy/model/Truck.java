package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private String color;
    private int numberOfWheels;

    public Truck() {
    }

    public Truck(String color, int numberOfWheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

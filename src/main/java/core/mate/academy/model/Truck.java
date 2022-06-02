package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {

    private int loadCapacity;
    private int trailerLength;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, int trailerLength) {
        setName(name);
        setColor(color);
        this.loadCapacity = loadCapacity;
        this.trailerLength = trailerLength;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

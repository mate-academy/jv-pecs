package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerLength;
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int trailerLength, int loadCapacity) {
        super.setName(name);
        super.setColor(color);
        this.trailerLength = trailerLength;
        this.loadCapacity = loadCapacity;
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String trailerLength;
    private String loadCapacity;

    public Truck() {
    }

    public Truck(String color, String name, String trailerLength, String loadCapacity) {
        this.trailerLength = trailerLength;
        this.loadCapacity = loadCapacity;
        setColor(color);
        setName(name);
    }

    public String getTrailerLength() {
        return trailerLength;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setTrailerLength(String trailerLength) {
        this.trailerLength = trailerLength;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

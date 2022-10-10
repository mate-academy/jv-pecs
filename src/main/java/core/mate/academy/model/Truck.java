package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerLength;
    private int trailerCapacity;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    public int getTrailerCapacity() {
        return trailerCapacity;
    }

    public void setTrailerCapacity(int trailerCapacity) {
        this.trailerCapacity = trailerCapacity;
    }
}

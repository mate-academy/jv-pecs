package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private boolean availabilityOfTrailer;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, boolean availabilityOfTrailer) {
        super(name, color);
        this.loadCapacity = loadCapacity;
        this.availabilityOfTrailer = availabilityOfTrailer;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setAvailabilityOfTrailer(boolean availabilityOfTrailer) {
        this.availabilityOfTrailer = availabilityOfTrailer;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isAvailabilityOfTrailer() {
        return availabilityOfTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

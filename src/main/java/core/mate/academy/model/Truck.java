package core.mate.academy.model;

public class Truck extends Machine {
    private int tripDistance;

    public Truck(String name, String color, int tripDistance) {
        super(name, color);
        this.tripDistance = tripDistance;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(int tripDistance) {
        this.tripDistance = tripDistance;
    }
}

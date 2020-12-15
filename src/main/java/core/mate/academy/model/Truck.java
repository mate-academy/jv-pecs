package core.mate.academy.model;

public class Truck extends Machine {
    private int maxDistance;

    public Truck() {
    }

    public Truck(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

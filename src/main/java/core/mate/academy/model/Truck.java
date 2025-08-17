package core.mate.academy.model;

public class Truck extends Machine {
    private int dimensions;
    private int bodySize;
    private int brakingDistance;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }

    public int getBrakingDistance() {
        return brakingDistance;
    }

    public void setBrakingDistance(int brakingDistance) {
        this.brakingDistance = brakingDistance;
    }
}

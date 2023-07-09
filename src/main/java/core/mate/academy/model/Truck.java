package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyType;
    private int loadingCapacity;
    private int numberOfAxes;

    public Truck() {
    }

    public Truck(String bodyType, int loadingCapacity, int numberOfAxes) {
        this.bodyType = bodyType;
        this.loadingCapacity = loadingCapacity;
        this.numberOfAxes = numberOfAxes;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public int getNumberOfAxes() {
        return numberOfAxes;
    }

    public void setNumberOfAxes(int numberOfAxes) {
        this.numberOfAxes = numberOfAxes;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

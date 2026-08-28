package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {
    private int wheelbase;
    private int tireSize;
    private int loadingHeight;

    public Truck() {
    }

    public Truck(int wheelbase, int tireSize, int loadingHeight) {
        this.wheelbase = wheelbase;
        this.tireSize = tireSize;
        this.loadingHeight = loadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    /**
     * wheelbase
     * tireSize
     * loadingHeight
     */

    public int getLoadingHeight() {
        return loadingHeight;
    }

    public void setLoadingHeight(int loadingHeight) {
        this.loadingHeight = loadingHeight;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(int wheelbase) {
        this.wheelbase = wheelbase;
    }
}

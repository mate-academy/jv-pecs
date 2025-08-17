package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoLoad;
    private int rangeOfMotion;

    public Truck() {
    }

    public Truck(int cargoLoad, int rangeOfMotion) {
        this.cargoLoad = cargoLoad;
        this.rangeOfMotion = rangeOfMotion;
    }

    public int getCargoLoad() {
        return cargoLoad;
    }

    public void setCargoLoad(int cargoLoad) {
        this.cargoLoad = cargoLoad;
    }

    public int getRangeOfMotion() {
        return rangeOfMotion;
    }

    public void setRangeOfMotion(int rangeOfMotion) {
        this.rangeOfMotion = rangeOfMotion;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

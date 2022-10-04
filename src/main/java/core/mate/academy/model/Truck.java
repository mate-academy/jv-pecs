package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int engineDisplacement;
    private int maxLoad;

    public Truck() {

    }

    public Truck(int engineDisplacement, int maxLoad) {
        this.engineDisplacement = engineDisplacement;
        this.maxLoad = maxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}

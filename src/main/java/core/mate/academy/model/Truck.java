package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckModel;
    private int loadCapacity;

    public Truck(String truckModel, int loadCapacity) {
        this.truckModel = truckModel;
        this.loadCapacity = loadCapacity;
    }

    public Truck() {
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

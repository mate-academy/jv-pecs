package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckId;
    private String truckModel;

    public Truck() {
    }

    public Truck(int truckId, String truckModel) {
        this.truckId = truckId;
        this.truckModel = truckModel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }
}

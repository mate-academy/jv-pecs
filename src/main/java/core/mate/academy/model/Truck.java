package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckModel;
    private int truckAge;

    public Truck() {
    }

    public Truck(String truckModel, int truckAge) {
        this.truckModel = truckModel;
        this.truckAge = truckAge;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckAge() {
        return truckAge;
    }

    public void setTruckAge(int truckAge) {
        this.truckAge = truckAge;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }
}

package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckBrand;
    private String truckModel;
    private int truckAge;

    public Truck(String truckBrand, String truckModel, int truckAge) {
        this.truckBrand = truckBrand;
        this.truckModel = truckModel;
        this.truckAge = truckAge;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

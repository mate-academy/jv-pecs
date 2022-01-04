package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckCustom1;
    private String truckCustom2;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getTruckCustom1() {
        return truckCustom1;
    }

    public void setTruckCustom1(String truckCustom1) {
        this.truckCustom1 = truckCustom1;
    }

    public String getTruckCustom2() {
        return truckCustom2;
    }

    public void setTruckCustom2(String truckCustom2) {
        this.truckCustom2 = truckCustom2;
    }
}

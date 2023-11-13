package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String chassisHeight;
    private String rearSuspensionType;

    public Truck() {
    }

    public Truck(String chassisHeight, String rearSuspensionType) {
        this.chassisHeight = chassisHeight;
        this.rearSuspensionType = rearSuspensionType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

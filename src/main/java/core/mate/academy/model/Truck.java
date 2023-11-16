package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private String licenseNum;

    public Truck() {
    }

    public Truck(String licenseNum, int maxSpeed) {
        this.licenseNum = licenseNum;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

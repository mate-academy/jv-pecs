package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int fuelBalance;

    public Truck() {
    }

    public int getFuelBalance() {
        return fuelBalance;
    }

    public void setFuelBalance(int fuelBalance) {
        this.fuelBalance = fuelBalance;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

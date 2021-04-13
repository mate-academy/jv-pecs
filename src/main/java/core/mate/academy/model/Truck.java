package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelAmount;

    public Truck() {
    }

    public Truck(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }
}

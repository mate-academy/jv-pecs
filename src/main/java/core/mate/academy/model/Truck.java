package core.mate.academy.model;

import java.util.List;

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

    @Override
    public List<Machine> get() {
        Truck threeWheelTruck = new Truck(3);
        Truck fourWheelTruck = new Truck(4);
        return List.of(threeWheelTruck, fourWheelTruck);
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }
}

package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int liftingCapacity;

    public Truck(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public Truck() {
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Truck(30));
        returnValue.add(new Truck(50));
        returnValue.add(new Truck(20));
        return returnValue;
    }
}
